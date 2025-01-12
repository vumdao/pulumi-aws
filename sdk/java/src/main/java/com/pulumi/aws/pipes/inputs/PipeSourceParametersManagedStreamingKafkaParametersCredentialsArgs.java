// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs Empty = new PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs();

    @Import(name="clientCertificateTlsAuth")
    private @Nullable Output<String> clientCertificateTlsAuth;

    public Optional<Output<String>> clientCertificateTlsAuth() {
        return Optional.ofNullable(this.clientCertificateTlsAuth);
    }

    @Import(name="saslScram512Auth")
    private @Nullable Output<String> saslScram512Auth;

    public Optional<Output<String>> saslScram512Auth() {
        return Optional.ofNullable(this.saslScram512Auth);
    }

    private PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs() {}

    private PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs(PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs $) {
        this.clientCertificateTlsAuth = $.clientCertificateTlsAuth;
        this.saslScram512Auth = $.saslScram512Auth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs $;

        public Builder() {
            $ = new PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs();
        }

        public Builder(PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs defaults) {
            $ = new PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientCertificateTlsAuth(@Nullable Output<String> clientCertificateTlsAuth) {
            $.clientCertificateTlsAuth = clientCertificateTlsAuth;
            return this;
        }

        public Builder clientCertificateTlsAuth(String clientCertificateTlsAuth) {
            return clientCertificateTlsAuth(Output.of(clientCertificateTlsAuth));
        }

        public Builder saslScram512Auth(@Nullable Output<String> saslScram512Auth) {
            $.saslScram512Auth = saslScram512Auth;
            return this;
        }

        public Builder saslScram512Auth(String saslScram512Auth) {
            return saslScram512Auth(Output.of(saslScram512Auth));
        }

        public PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs build() {
            return $;
        }
    }

}
