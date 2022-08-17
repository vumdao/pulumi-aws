// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    /**
     * Certificate identifier. For example, `rds-ca-2019`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Certificate identifier. For example, `rds-ca-2019`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * When enabled, returns the certificate with the latest `ValidTill`.
     * 
     */
    @Import(name="latestValidTill")
    private @Nullable Output<Boolean> latestValidTill;

    /**
     * @return When enabled, returns the certificate with the latest `ValidTill`.
     * 
     */
    public Optional<Output<Boolean>> latestValidTill() {
        return Optional.ofNullable(this.latestValidTill);
    }

    private GetCertificateArgs() {}

    private GetCertificateArgs(GetCertificateArgs $) {
        this.id = $.id;
        this.latestValidTill = $.latestValidTill;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateArgs $;

        public Builder() {
            $ = new GetCertificateArgs();
        }

        public Builder(GetCertificateArgs defaults) {
            $ = new GetCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Certificate identifier. For example, `rds-ca-2019`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Certificate identifier. For example, `rds-ca-2019`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param latestValidTill When enabled, returns the certificate with the latest `ValidTill`.
         * 
         * @return builder
         * 
         */
        public Builder latestValidTill(@Nullable Output<Boolean> latestValidTill) {
            $.latestValidTill = latestValidTill;
            return this;
        }

        /**
         * @param latestValidTill When enabled, returns the certificate with the latest `ValidTill`.
         * 
         * @return builder
         * 
         */
        public Builder latestValidTill(Boolean latestValidTill) {
            return latestValidTill(Output.of(latestValidTill));
        }

        public GetCertificateArgs build() {
            return $;
        }
    }

}