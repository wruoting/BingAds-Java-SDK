
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<CampaignAdditionalField>>
{


    public Collection<CampaignAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.CampaignAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignAdditionalField> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.CampaignAdditionalFieldConverter.convertToString(value));
    }

}
