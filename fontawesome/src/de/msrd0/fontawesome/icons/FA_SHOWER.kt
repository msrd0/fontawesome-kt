/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_SHOWER: Icon {
	
	override val name get() = "Shower"
	
	override val unicode get() = "f2cc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M288 384c-17.67 0-32 14.33-32 32c0 17.67 14.33 32 32 32s32-14.33 32-32C320 398.3 305.7 384 288 384zM416 256c-17.67 0-32 14.33-32 32c0 17.67 14.33 32 32 32s32-14.33 32-32C448 270.3 433.7 256 416 256zM480 192c-17.67 0-32 14.33-32 32c0 17.67 14.33 32 32 32s32-14.33 32-32C512 206.3 497.7 192 480 192zM288 320c0-17.67-14.33-32-32-32s-32 14.33-32 32c0 17.67 14.33 32 32 32S288 337.7 288 320zM320 224c-17.67 0-32 14.33-32 32c0 17.67 14.33 32 32 32s32-14.33 32-32C352 238.3 337.7 224 320 224zM384 224c17.67 0 32-14.33 32-32c0-17.67-14.33-32-32-32s-32 14.33-32 32C352 209.7 366.3 224 384 224zM352 320c-17.67 0-32 14.33-32 32c0 17.67 14.33 32 32 32s32-14.33 32-32C384 334.3 369.7 320 352 320zM347.3 91.31l-11.31-11.31c-6.248-6.248-16.38-6.248-22.63 0l-6.631 6.631c-35.15-26.29-81.81-29.16-119.6-8.779L170.5 61.25C132.2 22.95 63.65 18.33 21.98 71.16C7.027 90.11 0 114.3 0 138.4V464C0 472.8 7.164 480 16 480h32C56.84 480 64 472.8 64 464V131.9c0-19.78 16.09-35.87 35.88-35.87c9.438 0 18.69 3.828 25.38 10.5l16.61 16.61C121.5 160.9 124.3 207.6 150.6 242.7L144 249.4c-6.248 6.248-6.248 16.38 0 22.63l11.31 11.31c6.248 6.25 16.38 6.25 22.63 0l169.4-169.4C353.6 107.7 353.6 97.56 347.3 91.31z"/></svg>"""
		else -> null
	}
	
}
