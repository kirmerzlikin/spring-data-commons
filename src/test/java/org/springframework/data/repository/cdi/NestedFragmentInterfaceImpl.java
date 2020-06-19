package org.springframework.data.repository.cdi;

public class NestedFragmentInterfaceImpl implements RepositoryFragments.NestedFragmentInterface {

    @Override
    public String getKey() {
        return "NestedImpl";
    }
}
