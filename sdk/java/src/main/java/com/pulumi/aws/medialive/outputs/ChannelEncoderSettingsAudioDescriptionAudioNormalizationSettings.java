// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings {
    /**
     * @return Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 to the EBU R-128 specification.
     * 
     */
    private @Nullable String algorithm;
    /**
     * @return Algorithm control for the audio description.
     * 
     */
    private @Nullable String algorithmControl;
    /**
     * @return Target LKFS (loudness) to adjust volume to.
     * 
     */
    private @Nullable Double targetLkfs;

    private ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings() {}
    /**
     * @return Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 to the EBU R-128 specification.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * @return Algorithm control for the audio description.
     * 
     */
    public Optional<String> algorithmControl() {
        return Optional.ofNullable(this.algorithmControl);
    }
    /**
     * @return Target LKFS (loudness) to adjust volume to.
     * 
     */
    public Optional<Double> targetLkfs() {
        return Optional.ofNullable(this.targetLkfs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String algorithmControl;
        private @Nullable Double targetLkfs;
        public Builder() {}
        public Builder(ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.algorithmControl = defaults.algorithmControl;
    	      this.targetLkfs = defaults.targetLkfs;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder algorithmControl(@Nullable String algorithmControl) {
            this.algorithmControl = algorithmControl;
            return this;
        }
        @CustomType.Setter
        public Builder targetLkfs(@Nullable Double targetLkfs) {
            this.targetLkfs = targetLkfs;
            return this;
        }
        public ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings build() {
            final var o = new ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettings();
            o.algorithm = algorithm;
            o.algorithmControl = algorithmControl;
            o.targetLkfs = targetLkfs;
            return o;
        }
    }
}