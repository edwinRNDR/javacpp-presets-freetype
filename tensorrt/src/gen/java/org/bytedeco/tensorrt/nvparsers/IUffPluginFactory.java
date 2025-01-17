// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class IPluginFactory
 * 
 *  \brief Plugin factory used to configure plugins.
 *  */
@Name("nvuffparser::IPluginFactory") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class IUffPluginFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IUffPluginFactory(Pointer p) { super(p); }

    /**
     *  \brief A user implemented function that determines if a layer configuration is provided by an IPlugin.
     * 
     *  @param layerName Name of the layer which the user wishes to validate.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean isPlugin(String layerName);
    public native @Cast("bool") boolean isPlugin(@Cast("const char*") BytePointer layerName);

    /**
     *  \brief Creates a plugin.
     * 
     *  @param layerName Name of layer associated with the plugin.
     *  @param weights Weights used for the layer.
     *  @param nbWeights Number of weights.
     *  @param fc A collection of FieldMaps used as layer parameters for different plugin layers.
     * 
     *  @see FieldCollection
     *  */
    public native IPlugin createPlugin(String layerName, @Const Weights weights, int nbWeights,
                                                @Const @ByVal FieldCollection fc);
    public native IPlugin createPlugin(@Cast("const char*") BytePointer layerName, @Const Weights weights, int nbWeights,
                                                @Const @ByVal FieldCollection fc);

}
