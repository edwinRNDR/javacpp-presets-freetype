// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IResizeLayer
 * 
 *  \brief A resize layer in a network definition.
 * 
 *  Resize layer can be used for resizing a N-D tensor.
 * 
 *  Resize layer currently supports the following configurations:
 *      -   ResizeMode::kNEAREST - resizes innermost {@code m} dimensions of N-D, where 0 < m <= min(8, N) and N > 0
 *      -   ResizeMode::kLINEAR - resizes innermost {@code m} dimensions of N-D, where 0 < m <= min(3, N) and N > 0
 * 
 *  Default resize mode is ResizeMode::kNEAREST.
 *  Resize layer provides two ways to resize tensor dimensions.
 *      -   Set output dimensions directly. It can be done for static as well as dynamic resize layer.
 *          Static resize layer requires output dimensions to be known at build-time.
 *          Dynamic resize layer requires output dimensions to be set as one of the input tensors.
 *      -   Set scales for resize. Each output dimension is calculated as floor(input dimension * scale).
 *          Only static resize layer allows setting scales where the scales are known at build-time.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IResizeLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IResizeLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the output dimensions.
     * 
     *  @param dimensions The output dimensions. Number of output dimensions must be the same as the number of input dimensions.
     * 
     *  If there is a second input, i.e. resize layer is dynamic,
     *  calling setOutputDimensions() is an error and does not update the
     *  dimensions.
     * 
     *  Output dimensions can be specified directly, or via scale factors relative to input dimensions.
     *  Scales for resize can be provided using setScales().
     * 
     *  @see setScales
     *  @see getOutputDimensions
     *  */
    
    
    //!
    //!
    //!
    public native void setOutputDimensions(@ByVal Dims dimensions);

    /**
     *  \brief Get the output dimensions.
     * 
     *  @return The output dimensions.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getOutputDimensions();

    /**
     *  \brief Set the resize scales.
     * 
     *  @param scales An array of resize scales.
     *  @param nbScales Number of scales. Number of scales must be equal to the number of input dimensions.
     * 
     *  If there is a second input, i.e. resize layer is dynamic,
     *  calling setScales() is an error and does not update the scales.
     * 
     *  Output dimensions are calculated as follows:
     *  outputDims[i] = floor(inputDims[i] * scales[i])
     * 
     *  Output dimensions can be specified directly, or via scale factors relative to input dimensions.
     *  Output dimensions can be provided directly using setOutputDimensions().
     * 
     *  @see setOutputDimensions
     *  @see getScales
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native void setScales(@Const FloatPointer scales, int nbScales);
    public native void setScales(@Const FloatBuffer scales, int nbScales);
    public native void setScales(@Const float[] scales, int nbScales);

    /**
     *  \brief Copies resize scales to scales[0, ..., nbScales-1], where nbScales is the number of scales that were set.
     * 
     *  @param size The number of scales to get. If size != nbScales, no scales will be copied.
     * 
     *  @param scales Pointer to where to copy the scales. Scales will be copied only if
     *                size == nbScales and scales != nullptr.
     * 
     *  In case the size is not known consider using size = 0 and scales = nullptr. This method will return
     *  the number of resize scales.
     * 
     *  @return The number of resize scales i.e. nbScales if scales were set.
     *          Return -1 in case no scales were set or resize layer is used in dynamic mode.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getScales(int size, FloatPointer scales);
    public native int getScales(int size, FloatBuffer scales);
    public native int getScales(int size, float[] scales);

    /**
     *  \brief Set resize mode for an input tensor.
     * 
     *  Supported resize modes are Nearest Neighbor and Linear.
     * 
     *  @see ResizeMode
     *  */
    
    
    //!
    //!
    //!
    public native void setResizeMode(ResizeMode resizeMode);
    public native void setResizeMode(@Cast("nvinfer1::ResizeMode") int resizeMode);

    /**
     *  \brief Get resize mode for an input tensor.
     * 
     *  @return The resize mode.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native ResizeMode getResizeMode();

    /**
     *  \brief Set whether to align corners while resizing.
     * 
     *  If true, the centers of the 4 corner pixels of both input and output
     *  tensors are aligned i.e. preserves the values of corner
     *  pixels.
     * 
     *  Default: false.
     *  */
    
    
    //!
    //!
    //!
    public native void setAlignCorners(@Cast("bool") boolean alignCorners);

    /**
     *  \brief True if align corners has been set.
     * 
     *  @return True if align corners has been set, false otherwise.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean getAlignCorners();

    /**
     *  \brief Relaxes ILayer::setInput to allow appending a second input.
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor.
     * 
     *  Like ILayer::setInput, but additionally works if index == 1 and nbInputs == 1, and
     *  there is no implicit batch dimension, in which case nbInputs() changes to 2.
     *  Once such additional input is set, resize layer works in dynamic mode.
     * 
     *  When index == 1 and nbInputs == 1, the output dimensions are used from
     *  the input tensor, overriding the dimensions supplied by setOutputDimensions.
     * 
     *  \warning tensor must be a shape tensor.
     *  */
    public native void setInput(int index, @ByRef ITensor tensor);
}
