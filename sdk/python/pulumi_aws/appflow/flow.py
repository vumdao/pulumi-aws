# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FlowArgs', 'Flow']

@pulumi.input_type
class FlowArgs:
    def __init__(__self__, *,
                 destination_flow_configs: pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]],
                 source_flow_config: pulumi.Input['FlowSourceFlowConfigArgs'],
                 tasks: pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]],
                 trigger_config: pulumi.Input['FlowTriggerConfigArgs'],
                 description: Optional[pulumi.Input[str]] = None,
                 kms_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Flow resource.
        :param pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]] destination_flow_configs: A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        :param pulumi.Input['FlowSourceFlowConfigArgs'] source_flow_config: The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        :param pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]] tasks: A Task that Amazon AppFlow performs while transferring the data in the flow run.
        :param pulumi.Input['FlowTriggerConfigArgs'] trigger_config: A Trigger that determine how and when the flow runs.
        :param pulumi.Input[str] description: A description of the flow you want to create.
        :param pulumi.Input[str] kms_arn: The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        :param pulumi.Input[str] name: The name of the flow.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "destination_flow_configs", destination_flow_configs)
        pulumi.set(__self__, "source_flow_config", source_flow_config)
        pulumi.set(__self__, "tasks", tasks)
        pulumi.set(__self__, "trigger_config", trigger_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kms_arn is not None:
            pulumi.set(__self__, "kms_arn", kms_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="destinationFlowConfigs")
    def destination_flow_configs(self) -> pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]]:
        """
        A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        """
        return pulumi.get(self, "destination_flow_configs")

    @destination_flow_configs.setter
    def destination_flow_configs(self, value: pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]]):
        pulumi.set(self, "destination_flow_configs", value)

    @property
    @pulumi.getter(name="sourceFlowConfig")
    def source_flow_config(self) -> pulumi.Input['FlowSourceFlowConfigArgs']:
        """
        The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        """
        return pulumi.get(self, "source_flow_config")

    @source_flow_config.setter
    def source_flow_config(self, value: pulumi.Input['FlowSourceFlowConfigArgs']):
        pulumi.set(self, "source_flow_config", value)

    @property
    @pulumi.getter
    def tasks(self) -> pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]]:
        """
        A Task that Amazon AppFlow performs while transferring the data in the flow run.
        """
        return pulumi.get(self, "tasks")

    @tasks.setter
    def tasks(self, value: pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]]):
        pulumi.set(self, "tasks", value)

    @property
    @pulumi.getter(name="triggerConfig")
    def trigger_config(self) -> pulumi.Input['FlowTriggerConfigArgs']:
        """
        A Trigger that determine how and when the flow runs.
        """
        return pulumi.get(self, "trigger_config")

    @trigger_config.setter
    def trigger_config(self, value: pulumi.Input['FlowTriggerConfigArgs']):
        pulumi.set(self, "trigger_config", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the flow you want to create.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="kmsArn")
    def kms_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        """
        return pulumi.get(self, "kms_arn")

    @kms_arn.setter
    def kms_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the flow.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FlowState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 destination_flow_configs: Optional[pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]]] = None,
                 kms_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source_flow_config: Optional[pulumi.Input['FlowSourceFlowConfigArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tasks: Optional[pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]]] = None,
                 trigger_config: Optional[pulumi.Input['FlowTriggerConfigArgs']] = None):
        """
        Input properties used for looking up and filtering Flow resources.
        :param pulumi.Input[str] arn: The flow's Amazon Resource Name (ARN).
        :param pulumi.Input[str] description: A description of the flow you want to create.
        :param pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]] destination_flow_configs: A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        :param pulumi.Input[str] kms_arn: The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        :param pulumi.Input[str] name: The name of the flow.
        :param pulumi.Input['FlowSourceFlowConfigArgs'] source_flow_config: The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]] tasks: A Task that Amazon AppFlow performs while transferring the data in the flow run.
        :param pulumi.Input['FlowTriggerConfigArgs'] trigger_config: A Trigger that determine how and when the flow runs.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_flow_configs is not None:
            pulumi.set(__self__, "destination_flow_configs", destination_flow_configs)
        if kms_arn is not None:
            pulumi.set(__self__, "kms_arn", kms_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if source_flow_config is not None:
            pulumi.set(__self__, "source_flow_config", source_flow_config)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if tasks is not None:
            pulumi.set(__self__, "tasks", tasks)
        if trigger_config is not None:
            pulumi.set(__self__, "trigger_config", trigger_config)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The flow's Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the flow you want to create.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="destinationFlowConfigs")
    def destination_flow_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]]]:
        """
        A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        """
        return pulumi.get(self, "destination_flow_configs")

    @destination_flow_configs.setter
    def destination_flow_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FlowDestinationFlowConfigArgs']]]]):
        pulumi.set(self, "destination_flow_configs", value)

    @property
    @pulumi.getter(name="kmsArn")
    def kms_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        """
        return pulumi.get(self, "kms_arn")

    @kms_arn.setter
    def kms_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the flow.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sourceFlowConfig")
    def source_flow_config(self) -> Optional[pulumi.Input['FlowSourceFlowConfigArgs']]:
        """
        The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        """
        return pulumi.get(self, "source_flow_config")

    @source_flow_config.setter
    def source_flow_config(self, value: Optional[pulumi.Input['FlowSourceFlowConfigArgs']]):
        pulumi.set(self, "source_flow_config", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]]]:
        """
        A Task that Amazon AppFlow performs while transferring the data in the flow run.
        """
        return pulumi.get(self, "tasks")

    @tasks.setter
    def tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FlowTaskArgs']]]]):
        pulumi.set(self, "tasks", value)

    @property
    @pulumi.getter(name="triggerConfig")
    def trigger_config(self) -> Optional[pulumi.Input['FlowTriggerConfigArgs']]:
        """
        A Trigger that determine how and when the flow runs.
        """
        return pulumi.get(self, "trigger_config")

    @trigger_config.setter
    def trigger_config(self, value: Optional[pulumi.Input['FlowTriggerConfigArgs']]):
        pulumi.set(self, "trigger_config", value)


class Flow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 destination_flow_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowDestinationFlowConfigArgs']]]]] = None,
                 kms_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source_flow_config: Optional[pulumi.Input[pulumi.InputType['FlowSourceFlowConfigArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowTaskArgs']]]]] = None,
                 trigger_config: Optional[pulumi.Input[pulumi.InputType['FlowTriggerConfigArgs']]] = None,
                 __props__=None):
        """
        Provides an AppFlow flow resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_source_bucket_v2 = aws.s3.BucketV2("exampleSourceBucketV2")
        example_source_bucket_policy = aws.s3.BucketPolicy("exampleSourceBucketPolicy",
            bucket=example_source_bucket_v2.id,
            policy=\"\"\"{
            "Statement": [
                {
                    "Effect": "Allow",
                    "Sid": "AllowAppFlowSourceActions",
                    "Principal": {
                        "Service": "appflow.amazonaws.com"
                    },
                    "Action": [
                        "s3:ListBucket",
                        "s3:GetObject"
                    ],
                    "Resource": [
                        "arn:aws:s3:::example_source",
                        "arn:aws:s3:::example_source/*"
                    ]
                }
            ],
        	"Version": "2012-10-17"
        }
        \"\"\")
        example_bucket_objectv2 = aws.s3.BucketObjectv2("exampleBucketObjectv2",
            bucket=example_source_bucket_v2.id,
            key="example_source.csv",
            source=pulumi.FileAsset("example_source.csv"))
        example_destination_bucket_v2 = aws.s3.BucketV2("exampleDestinationBucketV2")
        example_destination_bucket_policy = aws.s3.BucketPolicy("exampleDestinationBucketPolicy",
            bucket=example_destination_bucket_v2.id,
            policy=\"\"\"
        {
            "Statement": [
                {
                    "Effect": "Allow",
                    "Sid": "AllowAppFlowDestinationActions",
                    "Principal": {
                        "Service": "appflow.amazonaws.com"
                    },
                    "Action": [
                        "s3:PutObject",
                        "s3:AbortMultipartUpload",
                        "s3:ListMultipartUploadParts",
                        "s3:ListBucketMultipartUploads",
                        "s3:GetBucketAcl",
                        "s3:PutObjectAcl"
                    ],
                    "Resource": [
                        "arn:aws:s3:::example_destination",
                        "arn:aws:s3:::example_destination/*"
                    ]
                }
            ],
        	"Version": "2012-10-17"
        }
        \"\"\")
        example_flow = aws.appflow.Flow("exampleFlow",
            source_flow_config=aws.appflow.FlowSourceFlowConfigArgs(
                connector_type="S3",
                source_connector_properties=aws.appflow.FlowSourceFlowConfigSourceConnectorPropertiesArgs(
                    s3=aws.appflow.FlowSourceFlowConfigSourceConnectorPropertiesS3Args(
                        bucket_name=example_source_bucket_policy.bucket,
                        bucket_prefix="example",
                    ),
                ),
            ),
            destination_flow_configs=[aws.appflow.FlowDestinationFlowConfigArgs(
                connector_type="S3",
                destination_connector_properties=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs(
                    s3=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args(
                        bucket_name=example_destination_bucket_policy.bucket,
                        s3_output_format_config=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs(
                            prefix_config=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs(
                                prefix_type="PATH",
                            ),
                        ),
                    ),
                ),
            )],
            tasks=[aws.appflow.FlowTaskArgs(
                source_fields=["exampleField"],
                destination_field="exampleField",
                task_type="Map",
                connector_operators=[aws.appflow.FlowTaskConnectorOperatorArgs(
                    s3="NO_OP",
                )],
            )],
            trigger_config=aws.appflow.FlowTriggerConfigArgs(
                trigger_type="OnDemand",
            ))
        ```

        ## Import

        AppFlow flows can be imported using the `arn`, e.g.

        ```sh
         $ pulumi import aws:appflow/flow:Flow example arn:aws:appflow:us-west-2:123456789012:flow/example-flow
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the flow you want to create.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowDestinationFlowConfigArgs']]]] destination_flow_configs: A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        :param pulumi.Input[str] kms_arn: The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        :param pulumi.Input[str] name: The name of the flow.
        :param pulumi.Input[pulumi.InputType['FlowSourceFlowConfigArgs']] source_flow_config: The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowTaskArgs']]]] tasks: A Task that Amazon AppFlow performs while transferring the data in the flow run.
        :param pulumi.Input[pulumi.InputType['FlowTriggerConfigArgs']] trigger_config: A Trigger that determine how and when the flow runs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AppFlow flow resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_source_bucket_v2 = aws.s3.BucketV2("exampleSourceBucketV2")
        example_source_bucket_policy = aws.s3.BucketPolicy("exampleSourceBucketPolicy",
            bucket=example_source_bucket_v2.id,
            policy=\"\"\"{
            "Statement": [
                {
                    "Effect": "Allow",
                    "Sid": "AllowAppFlowSourceActions",
                    "Principal": {
                        "Service": "appflow.amazonaws.com"
                    },
                    "Action": [
                        "s3:ListBucket",
                        "s3:GetObject"
                    ],
                    "Resource": [
                        "arn:aws:s3:::example_source",
                        "arn:aws:s3:::example_source/*"
                    ]
                }
            ],
        	"Version": "2012-10-17"
        }
        \"\"\")
        example_bucket_objectv2 = aws.s3.BucketObjectv2("exampleBucketObjectv2",
            bucket=example_source_bucket_v2.id,
            key="example_source.csv",
            source=pulumi.FileAsset("example_source.csv"))
        example_destination_bucket_v2 = aws.s3.BucketV2("exampleDestinationBucketV2")
        example_destination_bucket_policy = aws.s3.BucketPolicy("exampleDestinationBucketPolicy",
            bucket=example_destination_bucket_v2.id,
            policy=\"\"\"
        {
            "Statement": [
                {
                    "Effect": "Allow",
                    "Sid": "AllowAppFlowDestinationActions",
                    "Principal": {
                        "Service": "appflow.amazonaws.com"
                    },
                    "Action": [
                        "s3:PutObject",
                        "s3:AbortMultipartUpload",
                        "s3:ListMultipartUploadParts",
                        "s3:ListBucketMultipartUploads",
                        "s3:GetBucketAcl",
                        "s3:PutObjectAcl"
                    ],
                    "Resource": [
                        "arn:aws:s3:::example_destination",
                        "arn:aws:s3:::example_destination/*"
                    ]
                }
            ],
        	"Version": "2012-10-17"
        }
        \"\"\")
        example_flow = aws.appflow.Flow("exampleFlow",
            source_flow_config=aws.appflow.FlowSourceFlowConfigArgs(
                connector_type="S3",
                source_connector_properties=aws.appflow.FlowSourceFlowConfigSourceConnectorPropertiesArgs(
                    s3=aws.appflow.FlowSourceFlowConfigSourceConnectorPropertiesS3Args(
                        bucket_name=example_source_bucket_policy.bucket,
                        bucket_prefix="example",
                    ),
                ),
            ),
            destination_flow_configs=[aws.appflow.FlowDestinationFlowConfigArgs(
                connector_type="S3",
                destination_connector_properties=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs(
                    s3=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args(
                        bucket_name=example_destination_bucket_policy.bucket,
                        s3_output_format_config=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs(
                            prefix_config=aws.appflow.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs(
                                prefix_type="PATH",
                            ),
                        ),
                    ),
                ),
            )],
            tasks=[aws.appflow.FlowTaskArgs(
                source_fields=["exampleField"],
                destination_field="exampleField",
                task_type="Map",
                connector_operators=[aws.appflow.FlowTaskConnectorOperatorArgs(
                    s3="NO_OP",
                )],
            )],
            trigger_config=aws.appflow.FlowTriggerConfigArgs(
                trigger_type="OnDemand",
            ))
        ```

        ## Import

        AppFlow flows can be imported using the `arn`, e.g.

        ```sh
         $ pulumi import aws:appflow/flow:Flow example arn:aws:appflow:us-west-2:123456789012:flow/example-flow
        ```

        :param str resource_name: The name of the resource.
        :param FlowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 destination_flow_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowDestinationFlowConfigArgs']]]]] = None,
                 kms_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 source_flow_config: Optional[pulumi.Input[pulumi.InputType['FlowSourceFlowConfigArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowTaskArgs']]]]] = None,
                 trigger_config: Optional[pulumi.Input[pulumi.InputType['FlowTriggerConfigArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlowArgs.__new__(FlowArgs)

            __props__.__dict__["description"] = description
            if destination_flow_configs is None and not opts.urn:
                raise TypeError("Missing required property 'destination_flow_configs'")
            __props__.__dict__["destination_flow_configs"] = destination_flow_configs
            __props__.__dict__["kms_arn"] = kms_arn
            __props__.__dict__["name"] = name
            if source_flow_config is None and not opts.urn:
                raise TypeError("Missing required property 'source_flow_config'")
            __props__.__dict__["source_flow_config"] = source_flow_config
            __props__.__dict__["tags"] = tags
            if tasks is None and not opts.urn:
                raise TypeError("Missing required property 'tasks'")
            __props__.__dict__["tasks"] = tasks
            if trigger_config is None and not opts.urn:
                raise TypeError("Missing required property 'trigger_config'")
            __props__.__dict__["trigger_config"] = trigger_config
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Flow, __self__).__init__(
            'aws:appflow/flow:Flow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            destination_flow_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowDestinationFlowConfigArgs']]]]] = None,
            kms_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            source_flow_config: Optional[pulumi.Input[pulumi.InputType['FlowSourceFlowConfigArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowTaskArgs']]]]] = None,
            trigger_config: Optional[pulumi.Input[pulumi.InputType['FlowTriggerConfigArgs']]] = None) -> 'Flow':
        """
        Get an existing Flow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The flow's Amazon Resource Name (ARN).
        :param pulumi.Input[str] description: A description of the flow you want to create.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowDestinationFlowConfigArgs']]]] destination_flow_configs: A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        :param pulumi.Input[str] kms_arn: The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        :param pulumi.Input[str] name: The name of the flow.
        :param pulumi.Input[pulumi.InputType['FlowSourceFlowConfigArgs']] source_flow_config: The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FlowTaskArgs']]]] tasks: A Task that Amazon AppFlow performs while transferring the data in the flow run.
        :param pulumi.Input[pulumi.InputType['FlowTriggerConfigArgs']] trigger_config: A Trigger that determine how and when the flow runs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlowState.__new__(_FlowState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["destination_flow_configs"] = destination_flow_configs
        __props__.__dict__["kms_arn"] = kms_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["source_flow_config"] = source_flow_config
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["tasks"] = tasks
        __props__.__dict__["trigger_config"] = trigger_config
        return Flow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The flow's Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the flow you want to create.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="destinationFlowConfigs")
    def destination_flow_configs(self) -> pulumi.Output[Sequence['outputs.FlowDestinationFlowConfig']]:
        """
        A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
        """
        return pulumi.get(self, "destination_flow_configs")

    @property
    @pulumi.getter(name="kmsArn")
    def kms_arn(self) -> pulumi.Output[str]:
        """
        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        """
        return pulumi.get(self, "kms_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the flow.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sourceFlowConfig")
    def source_flow_config(self) -> pulumi.Output['outputs.FlowSourceFlowConfig']:
        """
        The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
        """
        return pulumi.get(self, "source_flow_config")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def tasks(self) -> pulumi.Output[Sequence['outputs.FlowTask']]:
        """
        A Task that Amazon AppFlow performs while transferring the data in the flow run.
        """
        return pulumi.get(self, "tasks")

    @property
    @pulumi.getter(name="triggerConfig")
    def trigger_config(self) -> pulumi.Output['outputs.FlowTriggerConfig']:
        """
        A Trigger that determine how and when the flow runs.
        """
        return pulumi.get(self, "trigger_config")
