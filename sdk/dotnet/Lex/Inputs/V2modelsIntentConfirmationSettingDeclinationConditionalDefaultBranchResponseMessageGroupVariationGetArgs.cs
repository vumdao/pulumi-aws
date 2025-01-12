// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customPayload")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadGetArgs>? CustomPayload { get; set; }

        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardGetArgs>? ImageResponseCard { get; set; }

        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageGetArgs>? PlainTextMessage { get; set; }

        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageGetArgs>? SsmlMessage { get; set; }

        public V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs()
        {
        }
        public static new V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs Empty => new V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs();
    }
}
