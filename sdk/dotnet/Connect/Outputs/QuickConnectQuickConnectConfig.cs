// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class QuickConnectQuickConnectConfig
    {
        /// <summary>
        /// Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.QuickConnectQuickConnectConfigPhoneConfig> PhoneConfigs;
        /// <summary>
        /// Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.QuickConnectQuickConnectConfigQueueConfig> QueueConfigs;
        /// <summary>
        /// Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
        /// </summary>
        public readonly string QuickConnectType;
        /// <summary>
        /// Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.QuickConnectQuickConnectConfigUserConfig> UserConfigs;

        [OutputConstructor]
        private QuickConnectQuickConnectConfig(
            ImmutableArray<Outputs.QuickConnectQuickConnectConfigPhoneConfig> phoneConfigs,

            ImmutableArray<Outputs.QuickConnectQuickConnectConfigQueueConfig> queueConfigs,

            string quickConnectType,

            ImmutableArray<Outputs.QuickConnectQuickConnectConfigUserConfig> userConfigs)
        {
            PhoneConfigs = phoneConfigs;
            QueueConfigs = queueConfigs;
            QuickConnectType = quickConnectType;
            UserConfigs = userConfigs;
        }
    }
}