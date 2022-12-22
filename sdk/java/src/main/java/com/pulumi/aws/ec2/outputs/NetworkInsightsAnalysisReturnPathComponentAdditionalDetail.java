// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisReturnPathComponentAdditionalDetail {
    private @Nullable String additionalDetailType;
    private @Nullable List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent> components;

    private NetworkInsightsAnalysisReturnPathComponentAdditionalDetail() {}
    public Optional<String> additionalDetailType() {
        return Optional.ofNullable(this.additionalDetailType);
    }
    public List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent> components() {
        return this.components == null ? List.of() : this.components;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisReturnPathComponentAdditionalDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalDetailType;
        private @Nullable List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent> components;
        public Builder() {}
        public Builder(NetworkInsightsAnalysisReturnPathComponentAdditionalDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetailType = defaults.additionalDetailType;
    	      this.components = defaults.components;
        }

        @CustomType.Setter
        public Builder additionalDetailType(@Nullable String additionalDetailType) {
            this.additionalDetailType = additionalDetailType;
            return this;
        }
        @CustomType.Setter
        public Builder components(@Nullable List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent> components) {
            this.components = components;
            return this;
        }
        public Builder components(NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponent... components) {
            return components(List.of(components));
        }
        public NetworkInsightsAnalysisReturnPathComponentAdditionalDetail build() {
            final var o = new NetworkInsightsAnalysisReturnPathComponentAdditionalDetail();
            o.additionalDetailType = additionalDetailType;
            o.components = components;
            return o;
        }
    }
}