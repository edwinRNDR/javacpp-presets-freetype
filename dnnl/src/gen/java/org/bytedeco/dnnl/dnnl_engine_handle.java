// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** A class for wrapping an DNNL handle. It is used as the base
 *  class for primitive (#dnnl_primitive_t), engine (#dnnl_engine_t), and
 *  stream (#dnnl_stream_t) handles. An object of the #dnnl::handle class
 *  can be passed by value. This class enables wrapping:
 *   - Newly constructed handles.
 *     \n In this case, the constructed handle uses reference counting provided
 *     by \p std::shared_ptr with a proper deleter function specified through
 *     the \p handle_traits class.
 *   - Pre-existing handles returned by the DNNL C API (for
 *     example, through dnnl_primitive_get_primitive_desc()).
 *     \n In this case, an DNNL C API handle is wrapped without a
 *     deleter because it is assumed that the handle wrapper for the original
 *     object deletes the handle (this model is similar to \p std::weak_ptr). */
@Name("dnnl::handle<dnnl_engine_t>") @NoOffset @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_engine_handle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_engine_handle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_engine_handle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public dnnl_engine_handle position(long position) {
        return (dnnl_engine_handle)super.position(position);
    }

    /** Empty constructor.
     * 
     *  Allows declaring an object before actual initialization
     *  (mostly for convenience).
     * 
     *  \warning
     *      Uninitialized object cannot be used in any library calls.
     *      Any attempt to use its methods or passing it to the other library
     *      function will lead to a thrown exception. */
    public dnnl_engine_handle() { super((Pointer)null); allocate(); }
    private native void allocate();
    public dnnl_engine_handle(@Const @ByRef dnnl_engine_handle arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef dnnl_engine_handle arg0);
    public native @ByRef @Name("operator =") dnnl_engine_handle put(@ByVal dnnl_engine_handle arg0);

    /** Constructs a C handle wrapper from a C handle.
     *  @param t The C handle to wrap.
     *  @param weak A flag to specify whether to construct a weak wrapper. */
    public dnnl_engine_handle(dnnl_engine t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
    private native void allocate(dnnl_engine t, @Cast("bool") boolean weak/*=false*/);
    public dnnl_engine_handle(dnnl_engine t) { super((Pointer)null); allocate(t); }
    private native void allocate(dnnl_engine t);

    /** Resets the value of a C handle.
     *  @param t The new value of the C handle.
     *  @param weak A flag to specify whether the wrapper should be weak. */
    public native void reset(dnnl_engine t, @Cast("bool") boolean weak/*=false*/);
    public native void reset(dnnl_engine t);

    /** Returns the value of the underlying C handle. */
    public native dnnl_engine get(@Cast("bool") boolean allow_emtpy/*=false*/);
    public native dnnl_engine get();

    public native @Name("operator dnnl_engine_t") dnnl_engine asDnnl_engine();

    public native @Cast("bool") @Name("operator bool") boolean asBoolean();

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef dnnl_engine_handle other);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef dnnl_engine_handle other);
}
