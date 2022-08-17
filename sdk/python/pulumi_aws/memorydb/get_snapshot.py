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

__all__ = [
    'GetSnapshotResult',
    'AwaitableGetSnapshotResult',
    'get_snapshot',
    'get_snapshot_output',
]

@pulumi.output_type
class GetSnapshotResult:
    """
    A collection of values returned by getSnapshot.
    """
    def __init__(__self__, arn=None, cluster_configurations=None, cluster_name=None, id=None, kms_key_arn=None, name=None, source=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if cluster_configurations and not isinstance(cluster_configurations, list):
            raise TypeError("Expected argument 'cluster_configurations' to be a list")
        pulumi.set(__self__, "cluster_configurations", cluster_configurations)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kms_key_arn and not isinstance(kms_key_arn, str):
            raise TypeError("Expected argument 'kms_key_arn' to be a str")
        pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The ARN of the snapshot.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="clusterConfigurations")
    def cluster_configurations(self) -> Sequence['outputs.GetSnapshotClusterConfigurationResult']:
        """
        The configuration of the cluster from which the snapshot was taken.
        """
        return pulumi.get(self, "cluster_configurations")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        """
        Name of the MemoryDB cluster that this snapshot was taken from.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> str:
        """
        ARN of the KMS key used to encrypt the snapshot at rest.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the cluster.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def source(self) -> str:
        """
        Indicates whether the snapshot is from an automatic backup (`automated`) or was created manually (`manual`).
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A map of tags assigned to the snapshot.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSnapshotResult(GetSnapshotResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSnapshotResult(
            arn=self.arn,
            cluster_configurations=self.cluster_configurations,
            cluster_name=self.cluster_name,
            id=self.id,
            kms_key_arn=self.kms_key_arn,
            name=self.name,
            source=self.source,
            tags=self.tags)


def get_snapshot(name: Optional[str] = None,
                 tags: Optional[Mapping[str, str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSnapshotResult:
    """
    Provides information about a MemoryDB Snapshot.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_snapshot(name="my-snapshot")
    ```


    :param str name: Name of the snapshot.
    :param Mapping[str, str] tags: A map of tags assigned to the snapshot.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:memorydb/getSnapshot:getSnapshot', __args__, opts=opts, typ=GetSnapshotResult).value

    return AwaitableGetSnapshotResult(
        arn=__ret__.arn,
        cluster_configurations=__ret__.cluster_configurations,
        cluster_name=__ret__.cluster_name,
        id=__ret__.id,
        kms_key_arn=__ret__.kms_key_arn,
        name=__ret__.name,
        source=__ret__.source,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_snapshot)
def get_snapshot_output(name: Optional[pulumi.Input[str]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSnapshotResult]:
    """
    Provides information about a MemoryDB Snapshot.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.memorydb.get_snapshot(name="my-snapshot")
    ```


    :param str name: Name of the snapshot.
    :param Mapping[str, str] tags: A map of tags assigned to the snapshot.
    """
    ...