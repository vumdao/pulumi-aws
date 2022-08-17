// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    /**
     * The name of the RDS instance
     * 
     */
    @Import(name="dbInstanceIdentifier", required=true)
    private String dbInstanceIdentifier;

    /**
     * @return The name of the RDS instance
     * 
     */
    public String dbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.dbInstanceIdentifier = $.dbInstanceIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePlainArgs $;

        public Builder() {
            $ = new GetInstancePlainArgs();
        }

        public Builder(GetInstancePlainArgs defaults) {
            $ = new GetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceIdentifier The name of the RDS instance
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            $.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetInstancePlainArgs build() {
            $.dbInstanceIdentifier = Objects.requireNonNull($.dbInstanceIdentifier, "expected parameter 'dbInstanceIdentifier' to be non-null");
            return $;
        }
    }

}