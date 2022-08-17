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

__all__ = [
    'GetInstancesResult',
    'AwaitableGetInstancesResult',
    'get_instances',
    'get_instances_output',
]

@pulumi.output_type
class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, filters=None, id=None, ids=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetInstancesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        Set of instance IDs of the matched SSM managed instances.
        """
        return pulumi.get(self, "ids")


class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            filters=self.filters,
            id=self.id,
            ids=self.ids)


def get_instances(filters: Optional[Sequence[pulumi.InputType['GetInstancesFilterArgs']]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstancesResult:
    """
    Use this data source to get the instance IDs of SSM managed instances.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssm.get_instances(filters=[aws.ssm.GetInstancesFilterArgs(
        name="PlatformTypes",
        values=["Linux"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetInstancesFilterArgs']] filters: Configuration block(s) for filtering. Detailed below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssm/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult).value

    return AwaitableGetInstancesResult(
        filters=__ret__.filters,
        id=__ret__.id,
        ids=__ret__.ids)


@_utilities.lift_output_func(get_instances)
def get_instances_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInstancesFilterArgs']]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstancesResult]:
    """
    Use this data source to get the instance IDs of SSM managed instances.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ssm.get_instances(filters=[aws.ssm.GetInstancesFilterArgs(
        name="PlatformTypes",
        values=["Linux"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetInstancesFilterArgs']] filters: Configuration block(s) for filtering. Detailed below.
    """
    ...