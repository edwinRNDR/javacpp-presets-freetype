// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPluginExt
 * 
 *  \brief Plugin class for user-implemented layers.
 * 
 *  Plugins are a mechanism for applications to implement custom layers. Each plugin is owned by the application, and its lifetime
 *  must span any use of it by TensorRT.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginExt extends IPlugin {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginExt(Pointer p) { super(p); }

    /**
     *  \brief Return the API version with which this plugin was built.
     * 
     *  Do not override this method as it is used by the TensorRT library to maintain backwards-compatibility with plugins.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getTensorRTVersion();

    /**
     *  \brief Check format support.
     * 
     *  @param type DataType requested.
     *  @param format PluginFormat requested.
     *  @return true if the plugin supports the type-format combination.
     * 
     *  This function is called by the implementations of INetworkDefinition, IBuilder, and ICudaEngine.
     *  In particular, it is called when creating an engine and when deserializing an engine.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean supportsFormat(DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format);
    public native @Cast("bool") boolean supportsFormat(@Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format);

    /**
     *  \brief Configure the layer.
     * 
     *  This function is called by the builder prior to initialize(). It provides an opportunity for the layer to make algorithm choices on the basis
     *  of its weights, dimensions, and maximum batch size.
     * 
     *  @param inputDims The input tensor dimensions.
     *  @param nbInputs The number of inputs.
     *  @param outputDims The output tensor dimensions.
     *  @param nbOutputs The number of outputs.
     *  @param type The data type selected for the engine.
     *  @param format The format selected for the engine.
     *  @param maxBatchSize The maximum batch size.
     * 
     *  The dimensions passed here do not include the outermost batch size (i.e. for 2-D image networks, they will be 3-dimensional CHW dimensions).
     *  */
    public native void configureWithFormat(@Const Dims inputDims, int nbInputs, @Const Dims outputDims, int nbOutputs, DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format, int maxBatchSize);
    public native void configureWithFormat(@Const Dims inputDims, int nbInputs, @Const Dims outputDims, int nbOutputs, @Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format, int maxBatchSize);
}
