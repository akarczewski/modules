package org.motechproject.outbox.api.domain;


/**
 *
 */
public class VoiceMessageType {
    private String voiceMessageTypeName;
    private String templateName;
    private boolean canBeSaved; // indicates if this type of messages allowed to be saved by patients in they voice outbox
    private boolean canBeReplayed; // indicates if this type of messages allowed to be replayed by a patient request after been played once

    public String getVoiceMessageTypeName() {
        return voiceMessageTypeName;
    }

    public void setVoiceMessageTypeName(String voiceMessageTypeName) {
        this.voiceMessageTypeName = voiceMessageTypeName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public boolean isCanBeSaved() {
        return canBeSaved;
    }

    public void setCanBeSaved(boolean canBeSaved) {
        this.canBeSaved = canBeSaved;
    }

    public boolean isCanBeReplayed() {
        return canBeReplayed;
    }

    public void setCanBeReplayed(boolean canBeReplayed) {
        this.canBeReplayed = canBeReplayed;
    }


    @Override
    public String toString() {
        return "VoiceMessageType{" +
                "voiceMessageTypeName='" + voiceMessageTypeName + '\'' +
                ", templateName='" + templateName + '\'' +
                ", canBeSaved=" + canBeSaved +
                ", canBeReplayed=" + canBeReplayed +
                '}';
    }


}
