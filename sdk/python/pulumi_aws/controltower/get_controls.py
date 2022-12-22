# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetControlsResult',
    'AwaitableGetControlsResult',
    'get_controls',
    'get_controls_output',
]

@pulumi.output_type
class GetControlsResult:
    """
    A collection of values returned by getControls.
    """
    def __init__(__self__, enabled_controls=None, id=None, target_identifier=None):
        if enabled_controls and not isinstance(enabled_controls, list):
            raise TypeError("Expected argument 'enabled_controls' to be a list")
        pulumi.set(__self__, "enabled_controls", enabled_controls)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if target_identifier and not isinstance(target_identifier, str):
            raise TypeError("Expected argument 'target_identifier' to be a str")
        pulumi.set(__self__, "target_identifier", target_identifier)

    @property
    @pulumi.getter(name="enabledControls")
    def enabled_controls(self) -> Sequence[str]:
        """
        List of all the ARNs for the controls applied to the `target_identifier`.
        """
        return pulumi.get(self, "enabled_controls")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="targetIdentifier")
    def target_identifier(self) -> str:
        return pulumi.get(self, "target_identifier")


class AwaitableGetControlsResult(GetControlsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetControlsResult(
            enabled_controls=self.enabled_controls,
            id=self.id,
            target_identifier=self.target_identifier)


def get_controls(target_identifier: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetControlsResult:
    """
    List of Control Tower controls applied to an OU.


    :param str target_identifier: The ARN of the organizational unit.
    """
    __args__ = dict()
    __args__['targetIdentifier'] = target_identifier
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:controltower/getControls:getControls', __args__, opts=opts, typ=GetControlsResult).value

    return AwaitableGetControlsResult(
        enabled_controls=__ret__.enabled_controls,
        id=__ret__.id,
        target_identifier=__ret__.target_identifier)


@_utilities.lift_output_func(get_controls)
def get_controls_output(target_identifier: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetControlsResult]:
    """
    List of Control Tower controls applied to an OU.


    :param str target_identifier: The ARN of the organizational unit.
    """
    ...