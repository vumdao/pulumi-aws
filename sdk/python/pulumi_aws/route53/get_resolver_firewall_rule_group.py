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
    'GetResolverFirewallRuleGroupResult',
    'AwaitableGetResolverFirewallRuleGroupResult',
    'get_resolver_firewall_rule_group',
    'get_resolver_firewall_rule_group_output',
]

@pulumi.output_type
class GetResolverFirewallRuleGroupResult:
    """
    A collection of values returned by getResolverFirewallRuleGroup.
    """
    def __init__(__self__, arn=None, creation_time=None, creator_request_id=None, firewall_rule_group_id=None, id=None, modification_time=None, name=None, owner_id=None, rule_count=None, share_status=None, status=None, status_message=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if creator_request_id and not isinstance(creator_request_id, str):
            raise TypeError("Expected argument 'creator_request_id' to be a str")
        pulumi.set(__self__, "creator_request_id", creator_request_id)
        if firewall_rule_group_id and not isinstance(firewall_rule_group_id, str):
            raise TypeError("Expected argument 'firewall_rule_group_id' to be a str")
        pulumi.set(__self__, "firewall_rule_group_id", firewall_rule_group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if modification_time and not isinstance(modification_time, str):
            raise TypeError("Expected argument 'modification_time' to be a str")
        pulumi.set(__self__, "modification_time", modification_time)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if rule_count and not isinstance(rule_count, int):
            raise TypeError("Expected argument 'rule_count' to be a int")
        pulumi.set(__self__, "rule_count", rule_count)
        if share_status and not isinstance(share_status, str):
            raise TypeError("Expected argument 'share_status' to be a str")
        pulumi.set(__self__, "share_status", share_status)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_message and not isinstance(status_message, str):
            raise TypeError("Expected argument 'status_message' to be a str")
        pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="creatorRequestId")
    def creator_request_id(self) -> str:
        return pulumi.get(self, "creator_request_id")

    @property
    @pulumi.getter(name="firewallRuleGroupId")
    def firewall_rule_group_id(self) -> str:
        return pulumi.get(self, "firewall_rule_group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="modificationTime")
    def modification_time(self) -> str:
        return pulumi.get(self, "modification_time")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="ruleCount")
    def rule_count(self) -> int:
        return pulumi.get(self, "rule_count")

    @property
    @pulumi.getter(name="shareStatus")
    def share_status(self) -> str:
        return pulumi.get(self, "share_status")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> str:
        return pulumi.get(self, "status_message")


class AwaitableGetResolverFirewallRuleGroupResult(GetResolverFirewallRuleGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResolverFirewallRuleGroupResult(
            arn=self.arn,
            creation_time=self.creation_time,
            creator_request_id=self.creator_request_id,
            firewall_rule_group_id=self.firewall_rule_group_id,
            id=self.id,
            modification_time=self.modification_time,
            name=self.name,
            owner_id=self.owner_id,
            rule_count=self.rule_count,
            share_status=self.share_status,
            status=self.status,
            status_message=self.status_message)


def get_resolver_firewall_rule_group(firewall_rule_group_id: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResolverFirewallRuleGroupResult:
    """
    `route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.

    This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.

    ## Example Usage

    The following example shows how to get a firewall rule group from its ID.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rule_group(firewall_rule_group_id="rslvr-frg-example")
    ```


    :param str firewall_rule_group_id: The ID of the rule group.
    """
    __args__ = dict()
    __args__['firewallRuleGroupId'] = firewall_rule_group_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:route53/getResolverFirewallRuleGroup:getResolverFirewallRuleGroup', __args__, opts=opts, typ=GetResolverFirewallRuleGroupResult).value

    return AwaitableGetResolverFirewallRuleGroupResult(
        arn=__ret__.arn,
        creation_time=__ret__.creation_time,
        creator_request_id=__ret__.creator_request_id,
        firewall_rule_group_id=__ret__.firewall_rule_group_id,
        id=__ret__.id,
        modification_time=__ret__.modification_time,
        name=__ret__.name,
        owner_id=__ret__.owner_id,
        rule_count=__ret__.rule_count,
        share_status=__ret__.share_status,
        status=__ret__.status,
        status_message=__ret__.status_message)


@_utilities.lift_output_func(get_resolver_firewall_rule_group)
def get_resolver_firewall_rule_group_output(firewall_rule_group_id: Optional[pulumi.Input[str]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResolverFirewallRuleGroupResult]:
    """
    `route53.ResolverFirewallRuleGroup` Retrieves the specified firewall rule group.

    This data source allows to retrieve details about a specific a Route 53 Resolver DNS Firewall rule group.

    ## Example Usage

    The following example shows how to get a firewall rule group from its ID.

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_resolver_firewall_rule_group(firewall_rule_group_id="rslvr-frg-example")
    ```


    :param str firewall_rule_group_id: The ID of the rule group.
    """
    ...