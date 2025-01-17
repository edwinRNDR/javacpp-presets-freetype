// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IUnaryLayer
 * 
 *  \brief Layer that represents an unary operation.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IUnaryLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IUnaryLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the unary operation for the layer.
     * 
     *  @see getOperation(), UnaryOperation
     *  */
    
    
    //!
    //!
    //!
    public native void setOperation(UnaryOperation op);
    public native void setOperation(@Cast("nvinfer1::UnaryOperation") int op);

    /**
     *  \brief Get the unary operation for the layer.
     * 
     *  @see setOperation(), UnaryOperation
     *  */
    public native UnaryOperation getOperation();
}
