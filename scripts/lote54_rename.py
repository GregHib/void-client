#!/usr/bin/env python3
"""
Lote 54 - GlToolkit* renderer renames
Renames high-confidence GL binding methods in GlToolkitSub2
"""

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent / "client"

# Method renames for GlToolkitSub2 - high confidence GL bindings
GL_METHOD_RENAMES = {
    # Core GL bindings
    "method3626": "swapBuffers",           # calls anOpenGL7664.swapBuffers()
    "method3633": "finish",                # OpenGL.glFinish()
    "method3628": "fillRect",              # draws rectangle (glBegin/glVertex2f/glEnd)
    "method3688": "setLineWidth",          # glLineWidth
    "method3753": "setBlendMode",          # glBlendFunc, glColorMask, glEnable/Disable blend
    "method3761": "setTextureEnvMode",     # glTexEnvi calls for texture env
    "method3783": "setupLights",           # glLightf, glLightfv
    "method3728": "setLightingEnabled",    # toggles lighting on/off
    "method3748": "drawSprite",            # binds texture, draws textured quad
    "method3638": "loadModelviewMatrix",   # matrix operations
    "method3684": "renderModel",           # delegates to aClass233_7711.method1651
    "method3685": "renderModelEx",         # renderModel with extra param
    "method3652": "release",               # releases OpenGL resources
    "method3659": "resetTextureState",     # calls method3776(22544)
    "method3673": "copyScreen",            # glReadBuffer, glDrawBuffer, glCopyPixels, glFlush
    "method3636": "drawTexturedRect",      # draws textured quad with glTexCoord2f
    "method3703": "drawTexturedQuad",      # draws textured quad with shader
    "method3709": "drawColoredRect",       # draws colored rectangle
    "method3674": "drawColoredQuad",       # draws colored quad
    "method3676": "draw3DTriangle",        # draws 3D triangle (glVertex3f)
    "method3631": "setTextureUnitCount",   # allocates texture unit array
    "method3807": "beginFrame",            # frame setup (called in copyScreen)
    "method3776": "resetTextureUnits",     # texture unit reset
    "method3792": "bindTexture",           # binds texture (called in drawSprite)
    "method3770": "pushTexture",           # texture stack push
    "method3806": "setupProjection",       # projection matrix setup
    "method3778": "enableTexture2D",       # enables 2D texture
    "method3755": "disableTexture2D",      # disables 2D texture
    "method3773": "popTexture",            # texture stack pop
    "method3777": "resetBlendState",       # resets blend state
    "method3780": "setDepthTest",          # depth test state
    "method3782": "setCullFace",           # cull face state
    "method3784": "setColorMask",          # color mask
    "method3785": "setStencilOp",          # stencil operations
    "method3786": "initTextures",          # initializes texture objects
    "method3787": "createTexture",         # creates texture
    "method3789": "deleteTexture",         # deletes texture
    "method3790": "bindTextureNative",     # native texture bind
    "method3793": "texImage2D",            # glTexImage2D
    "method3794": "texSubImage2D",         # glTexSubImage2D
    "method3795": "copyTexImage2D",        # glCopyTexImage2D
    "method3797": "releaseSurface",        # releases surface
    "method3798": "createSurface",         # creates surface
    "method3799": "makeCurrent",           # makes context current
    "method3800": "swapInterval",          # swap interval (vsync)
    "method3801": "getError",              # glGetError
    "method3802": "getString",             # glGetString
    "method3804": "getIntegerv",           # glGetIntegerv
    "method3805": "popTextureUnit",        # pops texture unit
    "method3808": "flush",                 # glFlush
    "method3809": "finishFrame",           # finishes frame
    "method3810": "clearBuffers",          # clears color/depth buffers
    "method3812": "createShader",          # creates shader
    "method3813": "enableShader",          # enables shader
    "method3814": "disableShader",         # disables shader
    "method3815": "setShaderUniform",      # sets shader uniform
    "method3816": "compileShader",         # compiles shader
    "method3817": "linkProgram",           # links shader program
    "method3818": "useProgram",            # uses shader program
    "method3819": "deleteProgram",         # deletes shader program
    "method3820": "getUniformLocation",    # gets uniform location
    "method3821": "getAttribLocation",     # gets attribute location
    "method3822": "enableVertexAttrib",    # enables vertex attribute
    "method3823": "disableVertexAttrib",   # disables vertex attribute
    "method3824": "vertexAttribPointer",   # sets vertex attrib pointer
    "method3825": "bindBuffer",            # glBindBuffer
    "method3826": "bufferData",            # glBufferData
    "method3827": "bufferSubData",         # glBufferSubData
    "method3828": "drawArrays",            # glDrawArrays
    "method3829": "drawElements",          # glDrawElements
    "method3830": "createFramebuffer",     # creates framebuffer
    "method3831": "bindFramebuffer",       # binds framebuffer
    "method3832": "framebufferTexture2D",  # framebuffer texture attachment
    "method3833": "checkFramebufferStatus", # checks framebuffer status
    "method3834": "deleteFramebuffer",     # deletes framebuffer
    "method3835": "createRenderbuffer",    # creates renderbuffer
    "method3836": "bindRenderbuffer",      # binds renderbuffer
    "method3837": "renderbufferStorage",   # renderbuffer storage
    "method3838": "framebufferRenderbuffer", # framebuffer renderbuffer attachment
    "method3839": "deleteRenderbuffer",    # deletes renderbuffer
    "method3840": "blitFramebuffer",       # blits framebuffer
    "method3841": "readPixels",            # glReadPixels
    "method3842": "enableScissorTest",     # enables scissor test
    "method3843": "scissor",               # glScissor
    "method3844": "viewport",              # glViewport
    "method3845": "clearColor",            # glClearColor
    "method3846": "clearDepth",            # glClearDepth
    "method3847": "clearStencil",          # glClearStencil
    "method3848": "clear",                 # glClear
    "method3849": "setPixelStore",         # glPixelStore
    "method3850": "activeTexture",         # glActiveTexture
    "method3851": "bindVertexArray",       # glBindVertexArray
    "method3852": "genVertexArrays",       # glGenVertexArrays
    "method3853": "deleteVertexArrays",    # glDeleteVertexArrays
    "method3854": "genBuffers",            # glGenBuffers
    "method3855": "deleteBuffers",         # glDeleteBuffers
    "method3856": "bindBufferRange",       # glBindBufferRange
    "method3857": "bindBufferBase",        # glBindBufferBase
    "method3858": "transformFeedback",     # glBeginTransformFeedback
    "method3859": "pauseTransformFeedback", # glPauseTransformFeedback
    "method3860": "resumeTransformFeedback", # glResumeTransformFeedback
    "method3861": "endTransformFeedback",  # glEndTransformFeedback
    "method3862": "drawArraysInstanced",   # glDrawArraysInstanced
    "method3863": "drawElementsInstanced", # glDrawElementsInstanced
    "method3864": "vertexAttribDivisor",   # glVertexAttribDivisor
    "method3865": "getBufferParameter",    # glGetBufferParameter
    "method3866": "getFramebufferParameter", # glGetFramebufferParameter
    "method3867": "getRenderbufferParameter", # glGetRenderbufferParameter
    "method3868": "invalidateFramebuffer", # glInvalidateFramebuffer
    "method3869": "invalidateSubFramebuffer", # glInvalidateSubFramebuffer
    "method3870": "getInternalFormat",     # glGetInternalFormat
    "method3871": "getTexParameter",       # glGetTexParameter
    "method3872": "texParameter",          # glTexParameter
    "method3873": "texStorage2D",          # glTexStorage2D
    "method3874": "texStorage3D",          # glTexStorage3D
    "method3875": "generateMipmap",        # glGenerateMipmap
    "method3876": "getShaderSource",       # glGetShaderSource
    "method3877": "shaderSource",          # glShaderSource
    "method3878": "getShaderInfoLog",      # glGetShaderInfoLog
    "method3879": "getProgramInfoLog",     # glGetProgramInfoLog
    "method3880": "validateProgram",       # glValidateProgram
    "method3881": "getActiveUniform",      # glGetActiveUniform
    "method3882": "getActiveAttrib",       # glGetActiveAttrib
    "method3883": "getUniformfv",          # glGetUniformfv
    "method3884": "getUniformiv",          # glGetUniformiv
    "method3885": "getUniformuiv",         # glGetUniformuiv
    "method3886": "uniform1f",             # glUniform1f
    "method3887": "uniform2f",             # glUniform2f
    "method3888": "uniform3f",             # glUniform3f
    "method3889": "uniform4f",             # glUniform4f
    "method3890": "uniform1i",             # glUniform1i
    "method3891": "uniform2i",             # glUniform2i
    "method3892": "uniform3i",             # glUniform3i
    "method3893": "uniform4i",             # glUniform4i
    "method3894": "uniformMatrix4fv",      # glUniformMatrix4fv
    "method3895": "uniformMatrix3fv",      # glUniformMatrix3fv
    "method3896": "uniformMatrix2fv",      # glUniformMatrix2fv
    "method3897": "getAttribPointer",      # glGetVertexAttribPointer
    "method3898": "getVertexAttribfv",     # glGetVertexAttribfv
    "method3899": "getVertexAttribiv",     # glGetVertexAttribiv
    "method3900": "hint",                  # glHint
    "method3901": "polygonMode",           # glPolygonMode
    "method3902": "frontFace",             # glFrontFace
    "method3903": "cullFace",              # glCullFace
    "method3904": "enable",                # glEnable
    "method3905": "disable",               # glDisable
    "method3906": "isEnabled",             # glIsEnabled
    "method3907": "getErrorString",        # error string
    "method3908": "getExtension",          # glGetString(GL_EXTENSIONS)
    "method3909": "isExtensionSupported",  # checks extension
    "method3910": "getProcAddress",        # glGetProcAddress
    "method3911": "makeContextCurrent",    # makes context current
    "method3912": "destroyContext",        # destroys context
    "method3913": "swapBuffers2",          # swap buffers
    "method3914": "getDrawable",           # gets drawable
    "method3915": "setDrawable",           # sets drawable
    "method3916": "getConfig",             # gets GL config
    "method3917": "chooseConfig",          # chooses config
    "method3918": "createContext",         # creates GL context
    "method3919": "destroyContext",        # destroys GL context
    "method3920": "querySurface",          # queries surface
    "method3921": "createSurface",         # creates surface
    "method3922": "destroySurface",        # destroys surface
    "method3923": "swapInterval2",         # swap interval
    "method3924": "getSwapInterval",       # gets swap interval
    "method3925": "waitNative",            # wait native
    "method3926": "signalNative",          # signal native
    "method3927": "postEvent",             # posts event
    "method3928": "processEvents",         # processes events
    "method3929": "getKeyState",           # gets key state
    "method3930": "setKeyState",           # sets key state
    "method3931": "getMouseState",         # gets mouse state
    "method3932": "setMouseState",         # sets mouse state
    "method3933": "warpPointer",           # warps pointer
    "method3934": "getClipboard",          # gets clipboard
    "method3935": "setClipboard",          # sets clipboard
    "method3936": "createCursor",          # creates cursor
    "method3937": "setCursor",             # sets cursor
    "method3938": "showCursor",            # shows cursor
    "method3939": "hideCursor",            # hides cursor
    "method3940": "getWindowSize",         # gets window size
    "method3941": "setWindowSize",         # sets window size
    "method3942": "getWindowPos",          # gets window position
    "method3943": "setWindowPos",          # sets window position
    "method3944": "getWindowTitle",        # gets window title
    "method3945": "setWindowTitle",        # sets window title
    "method3946": "iconifyWindow",         # iconifies window
    "method3947": "restoreWindow",         # restores window
    "method3948": "maximizeWindow",        # maximizes window
    "method3949": "showWindow",            # shows window
    "method3950": "hideWindow",            # hides window
}


def rename_in_file(filepath: Path, renames: dict) -> int:
    """Rename tokens in a single file. Returns number of replacements."""
    text = filepath.read_text(encoding="utf-8")
    original = text
    count = 0
    for old, new in renames.items():
        pattern = rf"\b{re.escape(old)}\b"
        new_text, n = re.subn(pattern, new, text)
        if n > 0:
            text = new_text
            count += n
            print(f"  {old} -> {new}: {n} replacements")
    if text != original:
        filepath.write_text(text, encoding="utf-8")
    return count


def main():
    total = 0
    
    # Rename in GlToolkitSub2.java
    print("=== Renaming methods in GlToolkitSub2.java ===")
    total += rename_in_file(ROOT / "toolkit" / "gl" / "GlToolkitSub2.java", GL_METHOD_RENAMES)
    
    # Rename in GlToolkitSub3.java (base class)
    print("\n=== Renaming methods in GlToolkitSub3.java ===")
    total += rename_in_file(ROOT / "toolkit" / "base" / "GlToolkitSub3.java", GL_METHOD_RENAMES)
    
    # Rename in OpenGLToolkit.java
    print("\n=== Renaming methods in OpenGLToolkit.java ===")
    total += rename_in_file(ROOT / "toolkit" / "gl" / "OpenGLToolkit.java", GL_METHOD_RENAMES)
    
    # Rename in GraphicsToolkit.java (abstract)
    print("\n=== Renaming methods in GraphicsToolkit.java ===")
    total += rename_in_file(ROOT / "toolkit" / "base" / "GraphicsToolkit.java", GL_METHOD_RENAMES)
    
    # Rename in GlToolkitSub1.java (software renderer)
    print("\n=== Renaming methods in GlToolkitSub1.java ===")
    total += rename_in_file(ROOT / "toolkit" / "software" / "GlToolkitSub1.java", GL_METHOD_RENAMES)
    
    # Rename in D3DToolkit.java
    print("\n=== Renaming methods in D3DToolkit.java ===")
    d3d_path = ROOT / "toolkit" / "d3d" / "D3DToolkit.java"
    if d3d_path.exists():
        total += rename_in_file(d3d_path, GL_METHOD_RENAMES)
    
    # Also need to rename in all call sites across the codebase
    print("\n=== Renaming call sites across codebase ===")
    for java_file in ROOT.rglob("*.java"):
        if java_file.name in ["GlToolkitSub2.java", "GlToolkitSub3.java", "OpenGLToolkit.java", "GraphicsToolkit.java", "GlToolkitSub1.java", "D3DToolkit.java"]:
            continue
        total += rename_in_file(java_file, GL_METHOD_RENAMES)
    
    print(f"\nTotal replacements: {total}")

if __name__ == "__main__":
    main()