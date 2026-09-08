/* Task - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class144} (JODE-obfuscated).
 * Async work item for {@link ReflectionInvoker}.
 * {@link #status}: 0=pending, 1=ok, 2=error. {@link #opcode} selects the worker action;
 * {@link #argument}/{@link #intArg0}/{@link #intArg1} are payload; {@link #result} is the outcome.
 */

public class Task {
    /** Worker opcode (1=socket, 2=thread, 4=URL, 8=getMethod, …). */
    int opcode;
    /** Next queued task. */
    Task next;
    /** Primary argument (host, Runnable, URL, Object[], …). */
    Object argument;
    /** 0=pending, 1=success, 2=failure. */
    public volatile int status = 0;
    /** Result object, or error message on failure. */
    public volatile Object result;
    /** Packed secondary ints (e.g. display mode bits). */
    int intArg0;
    /** Packed tertiary ints (e.g. port, thread priority). */
    public int intArg1;
}
