// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs Empty = new ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs();

    /**
     * Aac Settings. See AAC Settings for more details.
     * 
     */
    @Import(name="aacSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs> aacSettings;

    /**
     * @return Aac Settings. See AAC Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs>> aacSettings() {
        return Optional.ofNullable(this.aacSettings);
    }

    /**
     * Ac3 Settings. See AC3 Settings for more details.
     * 
     */
    @Import(name="ac3Settings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs> ac3Settings;

    /**
     * @return Ac3 Settings. See AC3 Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs>> ac3Settings() {
        return Optional.ofNullable(this.ac3Settings);
    }

    /**
     * - Eac3 Atmos Settings. See EAC3 Atmos Settings
     * 
     */
    @Import(name="eac3AtmosSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs> eac3AtmosSettings;

    /**
     * @return - Eac3 Atmos Settings. See EAC3 Atmos Settings
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs>> eac3AtmosSettings() {
        return Optional.ofNullable(this.eac3AtmosSettings);
    }

    /**
     * - Eac3 Settings. See EAC3 Settings
     * 
     */
    @Import(name="eac3Settings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs> eac3Settings;

    /**
     * @return - Eac3 Settings. See EAC3 Settings
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs>> eac3Settings() {
        return Optional.ofNullable(this.eac3Settings);
    }

    @Import(name="mp2Settings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs> mp2Settings;

    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs>> mp2Settings() {
        return Optional.ofNullable(this.mp2Settings);
    }

    @Import(name="passThroughSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs> passThroughSettings;

    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs>> passThroughSettings() {
        return Optional.ofNullable(this.passThroughSettings);
    }

    @Import(name="wavSettings")
    private @Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs> wavSettings;

    public Optional<Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs>> wavSettings() {
        return Optional.ofNullable(this.wavSettings);
    }

    private ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs() {}

    private ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs(ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs $) {
        this.aacSettings = $.aacSettings;
        this.ac3Settings = $.ac3Settings;
        this.eac3AtmosSettings = $.eac3AtmosSettings;
        this.eac3Settings = $.eac3Settings;
        this.mp2Settings = $.mp2Settings;
        this.passThroughSettings = $.passThroughSettings;
        this.wavSettings = $.wavSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aacSettings Aac Settings. See AAC Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder aacSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs> aacSettings) {
            $.aacSettings = aacSettings;
            return this;
        }

        /**
         * @param aacSettings Aac Settings. See AAC Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder aacSettings(ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs aacSettings) {
            return aacSettings(Output.of(aacSettings));
        }

        /**
         * @param ac3Settings Ac3 Settings. See AC3 Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder ac3Settings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs> ac3Settings) {
            $.ac3Settings = ac3Settings;
            return this;
        }

        /**
         * @param ac3Settings Ac3 Settings. See AC3 Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder ac3Settings(ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs ac3Settings) {
            return ac3Settings(Output.of(ac3Settings));
        }

        /**
         * @param eac3AtmosSettings - Eac3 Atmos Settings. See EAC3 Atmos Settings
         * 
         * @return builder
         * 
         */
        public Builder eac3AtmosSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs> eac3AtmosSettings) {
            $.eac3AtmosSettings = eac3AtmosSettings;
            return this;
        }

        /**
         * @param eac3AtmosSettings - Eac3 Atmos Settings. See EAC3 Atmos Settings
         * 
         * @return builder
         * 
         */
        public Builder eac3AtmosSettings(ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs eac3AtmosSettings) {
            return eac3AtmosSettings(Output.of(eac3AtmosSettings));
        }

        /**
         * @param eac3Settings - Eac3 Settings. See EAC3 Settings
         * 
         * @return builder
         * 
         */
        public Builder eac3Settings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs> eac3Settings) {
            $.eac3Settings = eac3Settings;
            return this;
        }

        /**
         * @param eac3Settings - Eac3 Settings. See EAC3 Settings
         * 
         * @return builder
         * 
         */
        public Builder eac3Settings(ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs eac3Settings) {
            return eac3Settings(Output.of(eac3Settings));
        }

        public Builder mp2Settings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs> mp2Settings) {
            $.mp2Settings = mp2Settings;
            return this;
        }

        public Builder mp2Settings(ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs mp2Settings) {
            return mp2Settings(Output.of(mp2Settings));
        }

        public Builder passThroughSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs> passThroughSettings) {
            $.passThroughSettings = passThroughSettings;
            return this;
        }

        public Builder passThroughSettings(ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs passThroughSettings) {
            return passThroughSettings(Output.of(passThroughSettings));
        }

        public Builder wavSettings(@Nullable Output<ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs> wavSettings) {
            $.wavSettings = wavSettings;
            return this;
        }

        public Builder wavSettings(ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs wavSettings) {
            return wavSettings(Output.of(wavSettings));
        }

        public ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs build() {
            return $;
        }
    }

}