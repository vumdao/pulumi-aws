# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetAccessPointResult',
    'AwaitableGetAccessPointResult',
    'get_access_point',
]

@pulumi.output_type
class GetAccessPointResult:
    """
    A collection of values returned by getAccessPoint.
    """
    def __init__(__self__, access_point_id=None, arn=None, file_system_arn=None, file_system_id=None, id=None, owner_id=None, posix_users=None, root_directories=None, tags=None):
        if access_point_id and not isinstance(access_point_id, str):
            raise TypeError("Expected argument 'access_point_id' to be a str")
        pulumi.set(__self__, "access_point_id", access_point_id)
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if file_system_arn and not isinstance(file_system_arn, str):
            raise TypeError("Expected argument 'file_system_arn' to be a str")
        pulumi.set(__self__, "file_system_arn", file_system_arn)
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        pulumi.set(__self__, "file_system_id", file_system_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if posix_users and not isinstance(posix_users, list):
            raise TypeError("Expected argument 'posix_users' to be a list")
        pulumi.set(__self__, "posix_users", posix_users)
        if root_directories and not isinstance(root_directories, list):
            raise TypeError("Expected argument 'root_directories' to be a list")
        pulumi.set(__self__, "root_directories", root_directories)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accessPointId")
    def access_point_id(self) -> str:
        return pulumi.get(self, "access_point_id")

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        Amazon Resource Name of the file system.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="fileSystemArn")
    def file_system_arn(self) -> str:
        """
        Amazon Resource Name of the file system.
        """
        return pulumi.get(self, "file_system_arn")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        """
        The ID of the file system for which the access point is intended.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="posixUsers")
    def posix_users(self) -> List['outputs.GetAccessPointPosixUserResult']:
        """
        Single element list containing operating system user and group applied to all file system requests made using the access point.
        """
        return pulumi.get(self, "posix_users")

    @property
    @pulumi.getter(name="rootDirectories")
    def root_directories(self) -> List['outputs.GetAccessPointRootDirectoryResult']:
        return pulumi.get(self, "root_directories")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        Key-value mapping of resource tags.
        """
        return pulumi.get(self, "tags")


class AwaitableGetAccessPointResult(GetAccessPointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessPointResult(
            access_point_id=self.access_point_id,
            arn=self.arn,
            file_system_arn=self.file_system_arn,
            file_system_id=self.file_system_id,
            id=self.id,
            owner_id=self.owner_id,
            posix_users=self.posix_users,
            root_directories=self.root_directories,
            tags=self.tags)


def get_access_point(access_point_id: Optional[str] = None,
                     tags: Optional[Mapping[str, str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessPointResult:
    """
    Provides information about an Elastic File System (EFS) Access Point.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.efs.get_access_point(access_point_id="fsap-12345678")
    ```


    :param str access_point_id: The ID that identifies the file system.
    :param Mapping[str, str] tags: Key-value mapping of resource tags.
    """
    __args__ = dict()
    __args__['accessPointId'] = access_point_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:efs/getAccessPoint:getAccessPoint', __args__, opts=opts, typ=GetAccessPointResult).value

    return AwaitableGetAccessPointResult(
        access_point_id=__ret__.access_point_id,
        arn=__ret__.arn,
        file_system_arn=__ret__.file_system_arn,
        file_system_id=__ret__.file_system_id,
        id=__ret__.id,
        owner_id=__ret__.owner_id,
        posix_users=__ret__.posix_users,
        root_directories=__ret__.root_directories,
        tags=__ret__.tags)