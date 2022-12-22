// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings {
    /**
     * @return Destination address and port number for RTP or UDP packets. See Destination for more details.
     * 
     */
    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination destination;
    private @Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings frameCaptureCdnSettings;

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings() {}
    /**
     * @return Destination address and port number for RTP or UDP packets. See Destination for more details.
     * 
     */
    public ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination destination() {
        return this.destination;
    }
    public Optional<ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings> frameCaptureCdnSettings() {
        return Optional.ofNullable(this.frameCaptureCdnSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination destination;
        private @Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings frameCaptureCdnSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.frameCaptureCdnSettings = defaults.frameCaptureCdnSettings;
        }

        @CustomType.Setter
        public Builder destination(ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder frameCaptureCdnSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettings frameCaptureCdnSettings) {
            this.frameCaptureCdnSettings = frameCaptureCdnSettings;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettings();
            o.destination = destination;
            o.frameCaptureCdnSettings = frameCaptureCdnSettings;
            return o;
        }
    }
}