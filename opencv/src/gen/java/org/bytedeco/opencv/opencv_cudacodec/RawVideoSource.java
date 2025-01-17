// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief Interface for video demultiplexing. :
<p>
User can implement own demultiplexing by implementing this interface.
 */
@Namespace("cv::cudacodec") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class RawVideoSource extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawVideoSource(Pointer p) { super(p); }


    /** \brief Returns next packet with RAW video frame.
    <p>
    @param data Pointer to frame data.
    @param size Size in bytes of current frame.
    @param endOfFile Indicates that it is end of stream.
     */
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") PointerPointer data, IntPointer size, @Cast("bool*") BoolPointer endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr BytePointer data, IntPointer size, @Cast("bool*") BoolPointer endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr ByteBuffer data, IntBuffer size, @Cast("bool*") boolean[] endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr byte[] data, int[] size, @Cast("bool*") BoolPointer endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr BytePointer data, IntPointer size, @Cast("bool*") boolean[] endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr ByteBuffer data, IntBuffer size, @Cast("bool*") BoolPointer endOfFile);
    public native @Cast("bool") boolean getNextPacket(@Cast("unsigned char**") @ByPtrPtr byte[] data, int[] size, @Cast("bool*") boolean[] endOfFile);

    /** \brief Returns information about video file format.
    */
    public native @ByVal FormatInfo format();
}
