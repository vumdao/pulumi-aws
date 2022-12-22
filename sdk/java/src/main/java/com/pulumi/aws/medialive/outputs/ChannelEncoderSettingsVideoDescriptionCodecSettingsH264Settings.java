// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings {
    /**
     * @return Enables or disables adaptive quantization.
     * 
     */
    private @Nullable String adaptiveQuantization;
    /**
     * @return Indicates that AFD values will be written into the output stream.
     * 
     */
    private @Nullable String afdSignaling;
    /**
     * @return Average bitrate in bits/second.
     * 
     */
    private @Nullable Integer bitrate;
    private @Nullable Integer bufFillPct;
    /**
     * @return Size of buffer in bits.
     * 
     */
    private @Nullable Integer bufSize;
    /**
     * @return Includes color space metadata in the output.
     * 
     */
    private @Nullable String colorMetadata;
    /**
     * @return Entropy encoding mode.
     * 
     */
    private @Nullable String entropyEncoding;
    /**
     * @return Filters to apply to an encode. See H264 Filter Settings for more details.
     * 
     */
    private @Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings filterSettings;
    /**
     * @return Four bit AFD value to write on all frames of video in the output stream.
     * 
     */
    private @Nullable String fixedAfd;
    private @Nullable String flickerAq;
    /**
     * @return Controls whether coding is performed on a field basis or on a frame basis.
     * 
     */
    private @Nullable String forceFieldPictures;
    /**
     * @return Indicates how the output video frame rate is specified.
     * 
     */
    private @Nullable String framerateControl;
    /**
     * @return Framerate denominator.
     * 
     */
    private @Nullable Integer framerateDenominator;
    /**
     * @return Framerate numerator.
     * 
     */
    private @Nullable Integer framerateNumerator;
    /**
     * @return GOP-B reference.
     * 
     */
    private @Nullable String gopBReference;
    /**
     * @return Frequency of closed GOPs.
     * 
     */
    private @Nullable Integer gopClosedCadence;
    /**
     * @return Number of B-frames between reference frames.
     * 
     */
    private @Nullable Integer gopNumBFrames;
    /**
     * @return GOP size in units of either frames of seconds per `gop_size_units`.
     * 
     */
    private @Nullable Double gopSize;
    /**
     * @return Indicates if the `gop_size` is specified in frames or seconds.
     * 
     */
    private @Nullable String gopSizeUnits;
    /**
     * @return H264 level.
     * 
     */
    private @Nullable String level;
    /**
     * @return Amount of lookahead.
     * 
     */
    private @Nullable String lookAheadRateControl;
    /**
     * @return Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * 
     */
    private @Nullable Integer maxBitrate;
    private @Nullable Integer minIInterval;
    /**
     * @return Number of reference frames to use.
     * 
     */
    private @Nullable Integer numRefFrames;
    /**
     * @return Indicates how the output pixel aspect ratio is specified.
     * 
     */
    private @Nullable String parControl;
    /**
     * @return Pixel Aspect Ratio denominator.
     * 
     */
    private @Nullable Integer parDenominator;
    /**
     * @return Pixel Aspect Ratio numerator.
     * 
     */
    private @Nullable Integer parNumerator;
    /**
     * @return H264 profile.
     * 
     */
    private @Nullable String profile;
    /**
     * @return Quality level.
     * 
     */
    private @Nullable String qualityLevel;
    /**
     * @return Controls the target quality for the video encode.
     * 
     */
    private @Nullable Integer qvbrQualityLevel;
    /**
     * @return Rate control mode.
     * 
     */
    private @Nullable String rateControlMode;
    /**
     * @return Sets the scan type of the output.
     * 
     */
    private @Nullable String scanType;
    /**
     * @return Scene change detection.
     * 
     */
    private @Nullable String sceneChangeDetect;
    /**
     * @return Number of slices per picture.
     * 
     */
    private @Nullable Integer slices;
    /**
     * @return Softness.
     * 
     */
    private @Nullable Integer softness;
    /**
     * @return Makes adjustments within each frame based on spatial variation of content complexity.
     * 
     */
    private @Nullable String spatialAq;
    /**
     * @return Subgop length.
     * 
     */
    private @Nullable String subgopLength;
    /**
     * @return Produces a bitstream compliant with SMPTE RP-2027.
     * 
     */
    private @Nullable String syntax;
    /**
     * @return Makes adjustments within each frame based on temporal variation of content complexity.
     * 
     */
    private @Nullable String temporalAq;
    /**
     * @return Determines how timecodes should be inserted into the video elementary stream.
     * 
     */
    private @Nullable String timecodeInsertion;

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings() {}
    /**
     * @return Enables or disables adaptive quantization.
     * 
     */
    public Optional<String> adaptiveQuantization() {
        return Optional.ofNullable(this.adaptiveQuantization);
    }
    /**
     * @return Indicates that AFD values will be written into the output stream.
     * 
     */
    public Optional<String> afdSignaling() {
        return Optional.ofNullable(this.afdSignaling);
    }
    /**
     * @return Average bitrate in bits/second.
     * 
     */
    public Optional<Integer> bitrate() {
        return Optional.ofNullable(this.bitrate);
    }
    public Optional<Integer> bufFillPct() {
        return Optional.ofNullable(this.bufFillPct);
    }
    /**
     * @return Size of buffer in bits.
     * 
     */
    public Optional<Integer> bufSize() {
        return Optional.ofNullable(this.bufSize);
    }
    /**
     * @return Includes color space metadata in the output.
     * 
     */
    public Optional<String> colorMetadata() {
        return Optional.ofNullable(this.colorMetadata);
    }
    /**
     * @return Entropy encoding mode.
     * 
     */
    public Optional<String> entropyEncoding() {
        return Optional.ofNullable(this.entropyEncoding);
    }
    /**
     * @return Filters to apply to an encode. See H264 Filter Settings for more details.
     * 
     */
    public Optional<ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings> filterSettings() {
        return Optional.ofNullable(this.filterSettings);
    }
    /**
     * @return Four bit AFD value to write on all frames of video in the output stream.
     * 
     */
    public Optional<String> fixedAfd() {
        return Optional.ofNullable(this.fixedAfd);
    }
    public Optional<String> flickerAq() {
        return Optional.ofNullable(this.flickerAq);
    }
    /**
     * @return Controls whether coding is performed on a field basis or on a frame basis.
     * 
     */
    public Optional<String> forceFieldPictures() {
        return Optional.ofNullable(this.forceFieldPictures);
    }
    /**
     * @return Indicates how the output video frame rate is specified.
     * 
     */
    public Optional<String> framerateControl() {
        return Optional.ofNullable(this.framerateControl);
    }
    /**
     * @return Framerate denominator.
     * 
     */
    public Optional<Integer> framerateDenominator() {
        return Optional.ofNullable(this.framerateDenominator);
    }
    /**
     * @return Framerate numerator.
     * 
     */
    public Optional<Integer> framerateNumerator() {
        return Optional.ofNullable(this.framerateNumerator);
    }
    /**
     * @return GOP-B reference.
     * 
     */
    public Optional<String> gopBReference() {
        return Optional.ofNullable(this.gopBReference);
    }
    /**
     * @return Frequency of closed GOPs.
     * 
     */
    public Optional<Integer> gopClosedCadence() {
        return Optional.ofNullable(this.gopClosedCadence);
    }
    /**
     * @return Number of B-frames between reference frames.
     * 
     */
    public Optional<Integer> gopNumBFrames() {
        return Optional.ofNullable(this.gopNumBFrames);
    }
    /**
     * @return GOP size in units of either frames of seconds per `gop_size_units`.
     * 
     */
    public Optional<Double> gopSize() {
        return Optional.ofNullable(this.gopSize);
    }
    /**
     * @return Indicates if the `gop_size` is specified in frames or seconds.
     * 
     */
    public Optional<String> gopSizeUnits() {
        return Optional.ofNullable(this.gopSizeUnits);
    }
    /**
     * @return H264 level.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return Amount of lookahead.
     * 
     */
    public Optional<String> lookAheadRateControl() {
        return Optional.ofNullable(this.lookAheadRateControl);
    }
    /**
     * @return Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
     * 
     */
    public Optional<Integer> maxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }
    public Optional<Integer> minIInterval() {
        return Optional.ofNullable(this.minIInterval);
    }
    /**
     * @return Number of reference frames to use.
     * 
     */
    public Optional<Integer> numRefFrames() {
        return Optional.ofNullable(this.numRefFrames);
    }
    /**
     * @return Indicates how the output pixel aspect ratio is specified.
     * 
     */
    public Optional<String> parControl() {
        return Optional.ofNullable(this.parControl);
    }
    /**
     * @return Pixel Aspect Ratio denominator.
     * 
     */
    public Optional<Integer> parDenominator() {
        return Optional.ofNullable(this.parDenominator);
    }
    /**
     * @return Pixel Aspect Ratio numerator.
     * 
     */
    public Optional<Integer> parNumerator() {
        return Optional.ofNullable(this.parNumerator);
    }
    /**
     * @return H264 profile.
     * 
     */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * @return Quality level.
     * 
     */
    public Optional<String> qualityLevel() {
        return Optional.ofNullable(this.qualityLevel);
    }
    /**
     * @return Controls the target quality for the video encode.
     * 
     */
    public Optional<Integer> qvbrQualityLevel() {
        return Optional.ofNullable(this.qvbrQualityLevel);
    }
    /**
     * @return Rate control mode.
     * 
     */
    public Optional<String> rateControlMode() {
        return Optional.ofNullable(this.rateControlMode);
    }
    /**
     * @return Sets the scan type of the output.
     * 
     */
    public Optional<String> scanType() {
        return Optional.ofNullable(this.scanType);
    }
    /**
     * @return Scene change detection.
     * 
     */
    public Optional<String> sceneChangeDetect() {
        return Optional.ofNullable(this.sceneChangeDetect);
    }
    /**
     * @return Number of slices per picture.
     * 
     */
    public Optional<Integer> slices() {
        return Optional.ofNullable(this.slices);
    }
    /**
     * @return Softness.
     * 
     */
    public Optional<Integer> softness() {
        return Optional.ofNullable(this.softness);
    }
    /**
     * @return Makes adjustments within each frame based on spatial variation of content complexity.
     * 
     */
    public Optional<String> spatialAq() {
        return Optional.ofNullable(this.spatialAq);
    }
    /**
     * @return Subgop length.
     * 
     */
    public Optional<String> subgopLength() {
        return Optional.ofNullable(this.subgopLength);
    }
    /**
     * @return Produces a bitstream compliant with SMPTE RP-2027.
     * 
     */
    public Optional<String> syntax() {
        return Optional.ofNullable(this.syntax);
    }
    /**
     * @return Makes adjustments within each frame based on temporal variation of content complexity.
     * 
     */
    public Optional<String> temporalAq() {
        return Optional.ofNullable(this.temporalAq);
    }
    /**
     * @return Determines how timecodes should be inserted into the video elementary stream.
     * 
     */
    public Optional<String> timecodeInsertion() {
        return Optional.ofNullable(this.timecodeInsertion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String adaptiveQuantization;
        private @Nullable String afdSignaling;
        private @Nullable Integer bitrate;
        private @Nullable Integer bufFillPct;
        private @Nullable Integer bufSize;
        private @Nullable String colorMetadata;
        private @Nullable String entropyEncoding;
        private @Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings filterSettings;
        private @Nullable String fixedAfd;
        private @Nullable String flickerAq;
        private @Nullable String forceFieldPictures;
        private @Nullable String framerateControl;
        private @Nullable Integer framerateDenominator;
        private @Nullable Integer framerateNumerator;
        private @Nullable String gopBReference;
        private @Nullable Integer gopClosedCadence;
        private @Nullable Integer gopNumBFrames;
        private @Nullable Double gopSize;
        private @Nullable String gopSizeUnits;
        private @Nullable String level;
        private @Nullable String lookAheadRateControl;
        private @Nullable Integer maxBitrate;
        private @Nullable Integer minIInterval;
        private @Nullable Integer numRefFrames;
        private @Nullable String parControl;
        private @Nullable Integer parDenominator;
        private @Nullable Integer parNumerator;
        private @Nullable String profile;
        private @Nullable String qualityLevel;
        private @Nullable Integer qvbrQualityLevel;
        private @Nullable String rateControlMode;
        private @Nullable String scanType;
        private @Nullable String sceneChangeDetect;
        private @Nullable Integer slices;
        private @Nullable Integer softness;
        private @Nullable String spatialAq;
        private @Nullable String subgopLength;
        private @Nullable String syntax;
        private @Nullable String temporalAq;
        private @Nullable String timecodeInsertion;
        public Builder() {}
        public Builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveQuantization = defaults.adaptiveQuantization;
    	      this.afdSignaling = defaults.afdSignaling;
    	      this.bitrate = defaults.bitrate;
    	      this.bufFillPct = defaults.bufFillPct;
    	      this.bufSize = defaults.bufSize;
    	      this.colorMetadata = defaults.colorMetadata;
    	      this.entropyEncoding = defaults.entropyEncoding;
    	      this.filterSettings = defaults.filterSettings;
    	      this.fixedAfd = defaults.fixedAfd;
    	      this.flickerAq = defaults.flickerAq;
    	      this.forceFieldPictures = defaults.forceFieldPictures;
    	      this.framerateControl = defaults.framerateControl;
    	      this.framerateDenominator = defaults.framerateDenominator;
    	      this.framerateNumerator = defaults.framerateNumerator;
    	      this.gopBReference = defaults.gopBReference;
    	      this.gopClosedCadence = defaults.gopClosedCadence;
    	      this.gopNumBFrames = defaults.gopNumBFrames;
    	      this.gopSize = defaults.gopSize;
    	      this.gopSizeUnits = defaults.gopSizeUnits;
    	      this.level = defaults.level;
    	      this.lookAheadRateControl = defaults.lookAheadRateControl;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.minIInterval = defaults.minIInterval;
    	      this.numRefFrames = defaults.numRefFrames;
    	      this.parControl = defaults.parControl;
    	      this.parDenominator = defaults.parDenominator;
    	      this.parNumerator = defaults.parNumerator;
    	      this.profile = defaults.profile;
    	      this.qualityLevel = defaults.qualityLevel;
    	      this.qvbrQualityLevel = defaults.qvbrQualityLevel;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.scanType = defaults.scanType;
    	      this.sceneChangeDetect = defaults.sceneChangeDetect;
    	      this.slices = defaults.slices;
    	      this.softness = defaults.softness;
    	      this.spatialAq = defaults.spatialAq;
    	      this.subgopLength = defaults.subgopLength;
    	      this.syntax = defaults.syntax;
    	      this.temporalAq = defaults.temporalAq;
    	      this.timecodeInsertion = defaults.timecodeInsertion;
        }

        @CustomType.Setter
        public Builder adaptiveQuantization(@Nullable String adaptiveQuantization) {
            this.adaptiveQuantization = adaptiveQuantization;
            return this;
        }
        @CustomType.Setter
        public Builder afdSignaling(@Nullable String afdSignaling) {
            this.afdSignaling = afdSignaling;
            return this;
        }
        @CustomType.Setter
        public Builder bitrate(@Nullable Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        @CustomType.Setter
        public Builder bufFillPct(@Nullable Integer bufFillPct) {
            this.bufFillPct = bufFillPct;
            return this;
        }
        @CustomType.Setter
        public Builder bufSize(@Nullable Integer bufSize) {
            this.bufSize = bufSize;
            return this;
        }
        @CustomType.Setter
        public Builder colorMetadata(@Nullable String colorMetadata) {
            this.colorMetadata = colorMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder entropyEncoding(@Nullable String entropyEncoding) {
            this.entropyEncoding = entropyEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder filterSettings(@Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings filterSettings) {
            this.filterSettings = filterSettings;
            return this;
        }
        @CustomType.Setter
        public Builder fixedAfd(@Nullable String fixedAfd) {
            this.fixedAfd = fixedAfd;
            return this;
        }
        @CustomType.Setter
        public Builder flickerAq(@Nullable String flickerAq) {
            this.flickerAq = flickerAq;
            return this;
        }
        @CustomType.Setter
        public Builder forceFieldPictures(@Nullable String forceFieldPictures) {
            this.forceFieldPictures = forceFieldPictures;
            return this;
        }
        @CustomType.Setter
        public Builder framerateControl(@Nullable String framerateControl) {
            this.framerateControl = framerateControl;
            return this;
        }
        @CustomType.Setter
        public Builder framerateDenominator(@Nullable Integer framerateDenominator) {
            this.framerateDenominator = framerateDenominator;
            return this;
        }
        @CustomType.Setter
        public Builder framerateNumerator(@Nullable Integer framerateNumerator) {
            this.framerateNumerator = framerateNumerator;
            return this;
        }
        @CustomType.Setter
        public Builder gopBReference(@Nullable String gopBReference) {
            this.gopBReference = gopBReference;
            return this;
        }
        @CustomType.Setter
        public Builder gopClosedCadence(@Nullable Integer gopClosedCadence) {
            this.gopClosedCadence = gopClosedCadence;
            return this;
        }
        @CustomType.Setter
        public Builder gopNumBFrames(@Nullable Integer gopNumBFrames) {
            this.gopNumBFrames = gopNumBFrames;
            return this;
        }
        @CustomType.Setter
        public Builder gopSize(@Nullable Double gopSize) {
            this.gopSize = gopSize;
            return this;
        }
        @CustomType.Setter
        public Builder gopSizeUnits(@Nullable String gopSizeUnits) {
            this.gopSizeUnits = gopSizeUnits;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder lookAheadRateControl(@Nullable String lookAheadRateControl) {
            this.lookAheadRateControl = lookAheadRateControl;
            return this;
        }
        @CustomType.Setter
        public Builder maxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        @CustomType.Setter
        public Builder minIInterval(@Nullable Integer minIInterval) {
            this.minIInterval = minIInterval;
            return this;
        }
        @CustomType.Setter
        public Builder numRefFrames(@Nullable Integer numRefFrames) {
            this.numRefFrames = numRefFrames;
            return this;
        }
        @CustomType.Setter
        public Builder parControl(@Nullable String parControl) {
            this.parControl = parControl;
            return this;
        }
        @CustomType.Setter
        public Builder parDenominator(@Nullable Integer parDenominator) {
            this.parDenominator = parDenominator;
            return this;
        }
        @CustomType.Setter
        public Builder parNumerator(@Nullable Integer parNumerator) {
            this.parNumerator = parNumerator;
            return this;
        }
        @CustomType.Setter
        public Builder profile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }
        @CustomType.Setter
        public Builder qualityLevel(@Nullable String qualityLevel) {
            this.qualityLevel = qualityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder qvbrQualityLevel(@Nullable Integer qvbrQualityLevel) {
            this.qvbrQualityLevel = qvbrQualityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder rateControlMode(@Nullable String rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }
        @CustomType.Setter
        public Builder scanType(@Nullable String scanType) {
            this.scanType = scanType;
            return this;
        }
        @CustomType.Setter
        public Builder sceneChangeDetect(@Nullable String sceneChangeDetect) {
            this.sceneChangeDetect = sceneChangeDetect;
            return this;
        }
        @CustomType.Setter
        public Builder slices(@Nullable Integer slices) {
            this.slices = slices;
            return this;
        }
        @CustomType.Setter
        public Builder softness(@Nullable Integer softness) {
            this.softness = softness;
            return this;
        }
        @CustomType.Setter
        public Builder spatialAq(@Nullable String spatialAq) {
            this.spatialAq = spatialAq;
            return this;
        }
        @CustomType.Setter
        public Builder subgopLength(@Nullable String subgopLength) {
            this.subgopLength = subgopLength;
            return this;
        }
        @CustomType.Setter
        public Builder syntax(@Nullable String syntax) {
            this.syntax = syntax;
            return this;
        }
        @CustomType.Setter
        public Builder temporalAq(@Nullable String temporalAq) {
            this.temporalAq = temporalAq;
            return this;
        }
        @CustomType.Setter
        public Builder timecodeInsertion(@Nullable String timecodeInsertion) {
            this.timecodeInsertion = timecodeInsertion;
            return this;
        }
        public ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings build() {
            final var o = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH264Settings();
            o.adaptiveQuantization = adaptiveQuantization;
            o.afdSignaling = afdSignaling;
            o.bitrate = bitrate;
            o.bufFillPct = bufFillPct;
            o.bufSize = bufSize;
            o.colorMetadata = colorMetadata;
            o.entropyEncoding = entropyEncoding;
            o.filterSettings = filterSettings;
            o.fixedAfd = fixedAfd;
            o.flickerAq = flickerAq;
            o.forceFieldPictures = forceFieldPictures;
            o.framerateControl = framerateControl;
            o.framerateDenominator = framerateDenominator;
            o.framerateNumerator = framerateNumerator;
            o.gopBReference = gopBReference;
            o.gopClosedCadence = gopClosedCadence;
            o.gopNumBFrames = gopNumBFrames;
            o.gopSize = gopSize;
            o.gopSizeUnits = gopSizeUnits;
            o.level = level;
            o.lookAheadRateControl = lookAheadRateControl;
            o.maxBitrate = maxBitrate;
            o.minIInterval = minIInterval;
            o.numRefFrames = numRefFrames;
            o.parControl = parControl;
            o.parDenominator = parDenominator;
            o.parNumerator = parNumerator;
            o.profile = profile;
            o.qualityLevel = qualityLevel;
            o.qvbrQualityLevel = qvbrQualityLevel;
            o.rateControlMode = rateControlMode;
            o.scanType = scanType;
            o.sceneChangeDetect = sceneChangeDetect;
            o.slices = slices;
            o.softness = softness;
            o.spatialAq = spatialAq;
            o.subgopLength = subgopLength;
            o.syntax = syntax;
            o.temporalAq = temporalAq;
            o.timecodeInsertion = timecodeInsertion;
            return o;
        }
    }
}