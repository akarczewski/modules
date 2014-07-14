package org.motechproject.mrs.domain;

import org.joda.time.DateTime;
import org.junit.Test;
import org.motechproject.openmrs19.domain.OpenMRSEncounter;
import org.motechproject.openmrs19.domain.OpenMRSFacility;
import org.motechproject.openmrs19.domain.OpenMRSPatient;
import org.motechproject.openmrs19.domain.OpenMRSProvider;
import org.motechproject.openmrs19.domain.OpenMRSUser;

import java.util.Date;
import java.util.Set;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class OpenMRSEncounterTest {
    @Test
    public void shouldUpdateFromExistingEncounter() {
        final String encounterTpye = "encounterTpye";
        final Set observations = mock(Set.class);
        final OpenMRSPatient patient = mock(OpenMRSPatient.class);
        final Date date = mock(Date.class);
        final OpenMRSFacility facility = mock(OpenMRSFacility.class);
        final OpenMRSUser creator = mock(OpenMRSUser.class);
        final OpenMRSProvider provider = mock(OpenMRSProvider.class);
        OpenMRSEncounter fromEncounter = new OpenMRSEncounter.OpenMRSEncounterBuilder().withId("id").withProvider(provider).withCreator(creator)
                .withFacility(facility).withDate(date).withPatient(patient).withObservations(observations)
                .withEncounterType(encounterTpye).build();

        final OpenMRSEncounter actualEncounter = new OpenMRSEncounter.OpenMRSEncounterBuilder().withId("id2").build().updateWithoutObs(fromEncounter);
        assertNull(actualEncounter.getObservations());

        assertThat(actualEncounter.getEncounterId(), is("id2"));
        assertThat(actualEncounter.getCreator(), is(creator));
        assertThat(actualEncounter.getProvider(), is(provider));
        assertThat(actualEncounter.getEncounterType(), is(encounterTpye));
        assertThat(actualEncounter.getDate().toDate(), is(new DateTime(date).toDate()));
        assertThat(actualEncounter.getFacility(), is(facility));
    }
}
