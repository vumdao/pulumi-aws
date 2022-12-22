// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics {
    /**
     * @return Whether the activity metrics are enabled.
     * 
     */
    private @Nullable Boolean enabled;

    private StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics() {}
    /**
     * @return Whether the activity metrics are enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics build() {
            final var o = new StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetrics();
            o.enabled = enabled;
            return o;
        }
    }
}