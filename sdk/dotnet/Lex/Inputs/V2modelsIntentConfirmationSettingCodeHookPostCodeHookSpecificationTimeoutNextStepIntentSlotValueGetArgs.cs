// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("interpretedValue")]
        public Input<string>? InterpretedValue { get; set; }

        public V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueGetArgs()
        {
        }
        public static new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueGetArgs Empty => new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueGetArgs();
    }
}
