// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Outputs
{

    [OutputType]
    public sealed class V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariation
    {
        public readonly Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayload? CustomPayload;
        public readonly Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCard? ImageResponseCard;
        public readonly Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessage? PlainTextMessage;
        public readonly Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessage? SsmlMessage;

        [OutputConstructor]
        private V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariation(
            Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayload? customPayload,

            Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCard? imageResponseCard,

            Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessage? plainTextMessage,

            Outputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessage? ssmlMessage)
        {
            CustomPayload = customPayload;
            ImageResponseCard = imageResponseCard;
            PlainTextMessage = plainTextMessage;
            SsmlMessage = ssmlMessage;
        }
    }
}
