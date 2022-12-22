// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings
    {
        /// <summary>
        /// Average bitrate in bits/second.
        /// </summary>
        public readonly double? Bitrate;
        /// <summary>
        /// Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
        /// </summary>
        public readonly string? BitstreamMode;
        /// <summary>
        /// Dolby Digital Plus coding mode.
        /// </summary>
        public readonly string? CodingMode;
        /// <summary>
        /// Sets the dialnorm for the output.
        /// </summary>
        public readonly int? Dialnorm;
        /// <summary>
        /// If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
        /// </summary>
        public readonly string? DrcProfile;
        /// <summary>
        /// When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding.
        /// </summary>
        public readonly string? LfeFilter;
        /// <summary>
        /// Metadata control.
        /// </summary>
        public readonly string? MetadataControl;

        [OutputConstructor]
        private ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3Settings(
            double? bitrate,

            string? bitstreamMode,

            string? codingMode,

            int? dialnorm,

            string? drcProfile,

            string? lfeFilter,

            string? metadataControl)
        {
            Bitrate = bitrate;
            BitstreamMode = bitstreamMode;
            CodingMode = codingMode;
            Dialnorm = dialnorm;
            DrcProfile = drcProfile;
            LfeFilter = lfeFilter;
            MetadataControl = metadataControl;
        }
    }
}