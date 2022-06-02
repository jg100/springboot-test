package com.example.movierec.collection;
import java.util.*;

public class CollectionTest {
    private List addrList;
    private Set addrSet;
    private Map addrMap;
    private Properties addrProp;

    public void setAddrList(List addrList) {
        this.addrList = addrList;
    }

    public void setAddrSet(Set addrSet) {
        this.addrSet = addrSet;
    }

    public void setAddrMap(Map addrMap) {
        this.addrMap = addrMap;
    }

    public void setAddrProp(Properties addrProp) {
        this.addrProp = addrProp;
    }

    public List getAddrList() {
        return addrList;
    }

    public Set getAddrSet() {
        return addrSet;
    }

    public Map getAddrMap() {
        return addrMap;
    }

    public Properties getAddrProp() {
        return addrProp;
    }
}
