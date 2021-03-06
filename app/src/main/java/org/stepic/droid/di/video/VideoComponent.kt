package org.stepic.droid.di.video

import dagger.Subcomponent
import org.stepic.droid.ui.fragments.VideoFragment

@VideoScope
@Subcomponent
interface VideoComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): VideoComponent
    }

    fun inject(videoFragment: VideoFragment)
}
