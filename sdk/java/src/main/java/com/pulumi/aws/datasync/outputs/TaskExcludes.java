// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskExcludes {
    /**
     * @return The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    private final @Nullable String filterType;
    /**
     * @return A single filter string that consists of the patterns to exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private TaskExcludes(
        @CustomType.Parameter("filterType") @Nullable String filterType,
        @CustomType.Parameter("value") @Nullable String value) {
        this.filterType = filterType;
        this.value = value;
    }

    /**
     * @return The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    public Optional<String> filterType() {
        return Optional.ofNullable(this.filterType);
    }
    /**
     * @return A single filter string that consists of the patterns to exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskExcludes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filterType;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskExcludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.value = defaults.value;
        }

        public Builder filterType(@Nullable String filterType) {
            this.filterType = filterType;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public TaskExcludes build() {
            return new TaskExcludes(filterType, value);
        }
    }
}