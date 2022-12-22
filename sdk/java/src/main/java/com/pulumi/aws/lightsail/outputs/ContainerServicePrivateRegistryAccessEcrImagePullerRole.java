// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerServicePrivateRegistryAccessEcrImagePullerRole {
    /**
     * @return A Boolean value that indicates whether to activate the role. The default is `false`.
     * 
     */
    private @Nullable Boolean isActive;
    private @Nullable String principalArn;

    private ContainerServicePrivateRegistryAccessEcrImagePullerRole() {}
    /**
     * @return A Boolean value that indicates whether to activate the role. The default is `false`.
     * 
     */
    public Optional<Boolean> isActive() {
        return Optional.ofNullable(this.isActive);
    }
    public Optional<String> principalArn() {
        return Optional.ofNullable(this.principalArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServicePrivateRegistryAccessEcrImagePullerRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isActive;
        private @Nullable String principalArn;
        public Builder() {}
        public Builder(ContainerServicePrivateRegistryAccessEcrImagePullerRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isActive = defaults.isActive;
    	      this.principalArn = defaults.principalArn;
        }

        @CustomType.Setter
        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder principalArn(@Nullable String principalArn) {
            this.principalArn = principalArn;
            return this;
        }
        public ContainerServicePrivateRegistryAccessEcrImagePullerRole build() {
            final var o = new ContainerServicePrivateRegistryAccessEcrImagePullerRole();
            o.isActive = isActive;
            o.principalArn = principalArn;
            return o;
        }
    }
}