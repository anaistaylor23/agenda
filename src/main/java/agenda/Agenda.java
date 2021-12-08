package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    /**
     * Adds an event to this agenda private
     *
     * @param e the event to add
     */
    private Set<Event> myEvents;

    public void addEvent(Event e) {
        myEvents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public Set<Event> eventsInDay(LocalDate day) {
        Set<Event> EventDay = null;
        for (Event e : myEvents) {
            if (e.isInDay(day)) {
                EventDay.add(e);
            }
            
        }
    return EventDay;
    }
}
