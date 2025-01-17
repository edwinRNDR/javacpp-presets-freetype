// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

/**
 *  \class INvPlugin
 * 
 *  \brief Common interface for the Nvidia created plugins.
 * 
 *  This class provides a common subset of functionality that is used
 *  to provide distinguish the Nvidia created plugins. Each plugin provides a
 *  function to validate the parameter options and create the plugin
 *  object.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class INvPlugin extends IPlugin {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public INvPlugin(Pointer p) { super(p); }

    /**
     *  \brief Get the parameter plugin ID.
     * 
     *  @return The ID of the plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal PluginType getPluginType();

    /**
     *  \brief Get the name of the plugin from the ID
     * 
     *  @return The name of the plugin specified by \p id. Return nullptr if invalid ID is specified.
     * 
     *  The valid \p id values are ranged [0, numPlugins()).
     *  */
    
    
    //!
    //!
    //!
    public native String getName();

    /**
     *  \brief Destroy the plugin.
     * 
     *  The valid \p id values are ranged [0, numPlugins()).
     *  */
    public native void destroy();
}
