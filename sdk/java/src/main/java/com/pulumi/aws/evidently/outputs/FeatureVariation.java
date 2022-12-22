// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.outputs;

import com.pulumi.aws.evidently.outputs.FeatureVariationValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FeatureVariation {
    /**
     * @return The name of the variation. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    private String name;
    /**
     * @return A block that specifies the value assigned to this variation. Detailed below
     * 
     */
    private FeatureVariationValue value;

    private FeatureVariation() {}
    /**
     * @return The name of the variation. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A block that specifies the value assigned to this variation. Detailed below
     * 
     */
    public FeatureVariationValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureVariation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private FeatureVariationValue value;
        public Builder() {}
        public Builder(FeatureVariation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(FeatureVariationValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FeatureVariation build() {
            final var o = new FeatureVariation();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}