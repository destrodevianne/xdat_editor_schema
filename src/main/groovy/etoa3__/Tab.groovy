package etoa3__

import acmi.l2.clientmod.l2resources.Sysstr
import acmi.l2.clientmod.l2resources.Tex
import acmi.l2.clientmod.util.IOEntity
import acmi.l2.clientmod.util.IOUtil
import acmi.l2.clientmod.util.Type
import acmi.l2.clientmod.util.defaultio.DefaultIO
import groovy.beans.Bindable

@Bindable
@DefaultIO
class Tab extends DefaultProperty {
    @Type(TabElement.class)
    List<TabElement> tabs = []

    @Bindable
    @DefaultIO
    static class TabElement implements IOEntity {
        @Sysstr
        int buttonName = -9999
        String buttonNameText = 'undefined'
        int nameOffsetX
        int nameOffsetY
        String target = 'undefined'
        int width
        int height
        @Tex
        String normalTex = 'undefined'
        @Tex
        String pushedTex = 'undefined'
        Boolean movable = false
        int gap
        @Sysstr
        int tooltip = -1
        Boolean noHighlight
        @Tex
        String blinkTextureName = ""

        @Override
        String toString() {
            getClass().simpleName
        }

        // @formatter:off
        @Deprecated int getTitleStringId() { buttonName }
        @Deprecated void setTitleStringId(int titleStringId) { this.buttonName = titleStringId }

        @Deprecated String getTitleStringValue() { buttonNameText }
        @Deprecated void setTitleStringValue(String titleStringValue) { this.buttonNameText = titleStringValue }

        @Deprecated int getUnk100() { nameOffsetX }
        @Deprecated void setUnk100(int unk100) { this.nameOffsetX = unk100 }

        @Deprecated int getUnk101() { nameOffsetY }
        @Deprecated void setUnk101(int unk101) { this.nameOffsetY = unk101 }

        @Deprecated String getContextCtrl() { target }
        @Deprecated void setContextCtrl(String contextCtrl) { this.target = contextCtrl }

        @Deprecated int getHeadWidth() { width }
        @Deprecated void setHeadWidth(int headWidth) { this.width = headWidth }

        @Deprecated int getHeadHeight() { height }
        @Deprecated void setHeadHeight(int headHeight) { this.height = headHeight }

        @Deprecated String getTextureUnselected() { normalTex }
        @Deprecated void setTextureUnselected(String textureUnselected) { this.normalTex = textureUnselected }

        @Deprecated String getTextureSelected() { pushedTex }
        @Deprecated void setTextureSelected(String textureSelected) { this.pushedTex = textureSelected }

        @Deprecated boolean getFloatable() { movable }
        @Deprecated void setFloatable(boolean floatable) { this.movable = floatable }

        @Deprecated int getSpaceAfter() { gap }
        @Deprecated void setSpaceAfter(int spaceAfter) { this.gap = spaceAfter }

        @Deprecated int getUnk110() { tooltip }
        @Deprecated void setUnk110(int unk110) { this.tooltip = unk110 }

        @Deprecated int getUnk111() { IOUtil.boolToInt(noHighlight) }
        @Deprecated void setUnk111(int unk111) { this.noHighlight = IOUtil.intToBool(unk111) }

        @Deprecated String getUnk112() { blinkTextureName }
        @Deprecated void setUnk112(String unk112) { this.blinkTextureName = unk112 }
        // @formatter:on
    }
}
