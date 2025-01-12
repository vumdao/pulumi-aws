// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir {
    private @Nullable String medium;
    private String sizeLimit;

    private JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir() {}
    public Optional<String> medium() {
        return Optional.ofNullable(this.medium);
    }
    public String sizeLimit() {
        return this.sizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String medium;
        private String sizeLimit;
        public Builder() {}
        public Builder(JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.medium = defaults.medium;
    	      this.sizeLimit = defaults.sizeLimit;
        }

        @CustomType.Setter
        public Builder medium(@Nullable String medium) {

            this.medium = medium;
            return this;
        }
        @CustomType.Setter
        public Builder sizeLimit(String sizeLimit) {
            if (sizeLimit == null) {
              throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir", "sizeLimit");
            }
            this.sizeLimit = sizeLimit;
            return this;
        }
        public JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir build() {
            final var _resultValue = new JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDir();
            _resultValue.medium = medium;
            _resultValue.sizeLimit = sizeLimit;
            return _resultValue;
        }
    }
}
