// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;



/**
 *  \class IRuntime
 * 
 *  \brief Allows a serialized functionally unsafe engine to be deserialized.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRuntime extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRuntime(Pointer p) { super(p); }

    /**
     *  \brief Deserialize an engine from a stream.
     * 
     *  @param blob The memory that holds the serialized engine.
     *  @param size The size of the memory.
     *  @param pluginFactory The plugin factory, if any plugins are used by the network, otherwise nullptr.
     * 
     *  @return The engine, or nullptr if it could not be deserialized.
     *  */
    
    
    //!
    //!
    public native @NoException ICudaEngine deserializeCudaEngine(@Const Pointer blob, @Cast("std::size_t") long size, IPluginFactory pluginFactory);

    /**
     *  \brief Set the DLA core that the deserialized engine must execute on.
     *  @param dlaCore The DLA core to execute the engine on (0 to N-1, where N is the maximum number of DLA's present on the device). Default value is 0.
     *  @see getDLACore()
     *  */
    
    
    //!
    //!
    public native @NoException void setDLACore(int dlaCore);

    /**
     *  \brief Get the DLA core that the engine executes on.
     *  @return If setDLACore is called, returns DLA core from 0 to N-1, else returns 0.
     *  */
    
    
    //!
    //!
    public native @NoException int getDLACore();

    /**
     *  \brief Returns number of DLA hardware cores accessible.
     *  */
    
    
    //!
    //!
    public native @NoException int getNbDLACores();

    /**
     *  \brief Destroy this object.
     *  */
    public native @NoException void destroy();
    /**
     *  \brief Set the GPU allocator.
     *  @param allocator Set the GPU allocator to be used by the runtime. All GPU memory acquired will use this allocator. If NULL is passed, the default allocator will be used.
     * 
     *  Default: uses cudaMalloc/cudaFree.
     * 
     *  If nullptr is passed, the default allocator will be used.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException void setGpuAllocator(IGpuAllocator allocator);

    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  @param recorder The error recorder to register with this interface. */
    //
    /** @see getErrorRecorder
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A default error recorder does not exist,
     *  so a nullptr will be returned if setErrorRecorder has not been called.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException IErrorRecorder getErrorRecorder();

    /**
     *  \breif Deserialize an engine from a stream when plugin factory is not used.
     * 
     *  @param blob The memory that holds the serialized engine.
     *  @param size The size of the memory.
     * 
     *  @return The engine, or nullptr if it could not be deserialized.
     *  */
    public native @NoException ICudaEngine deserializeCudaEngine(@Const Pointer blob, @Cast("std::size_t") long size);
}
