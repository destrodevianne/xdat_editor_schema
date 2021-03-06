package ct0

import acmi.l2.clientmod.l2resources.Tex
import acmi.l2.clientmod.util.defaultio.DefaultIO
import groovy.beans.Bindable
import groovy.transform.CompileStatic

@Bindable
@DefaultIO
@CompileStatic
class FishViewportWindow extends DefaultProperty {
    @Tex
    String texBack
    @Tex
    String texClock
    @Tex
    String texFishHPBar
    @Tex
    String texFishHPBarBack
    @Tex
    String texFishFakeHPBarWarning
    @Tex
    String texFishingEffect
    @Tex
    String texIconPumping
    @Tex
    String texIconReeling
}
