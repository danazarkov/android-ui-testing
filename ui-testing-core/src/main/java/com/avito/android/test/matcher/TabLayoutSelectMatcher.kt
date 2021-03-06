package com.avito.android.test.matcher

import android.support.design.widget.TabLayout
import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import org.hamcrest.Description

internal class TabLayoutSelectMatcher(private val position: Int) :
    BoundedMatcher<View, TabLayout>(TabLayout::class.java) {

    override fun describeTo(description: Description) {
        description.appendText("with tab layout selected tab position: $position")
    }

    override fun matchesSafely(tabLayout: TabLayout): Boolean {
        return tabLayout.selectedTabPosition == position
    }
}
