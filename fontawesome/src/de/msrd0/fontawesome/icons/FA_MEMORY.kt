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

object FA_MEMORY: Icon {
	
	override val name get() = "Memory"
	
	override val unicode get() = "f538"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M0 448h80v-32c0-8.838 7.164-16 16-16c8.838 0 16 7.162 16 16v32h96v-32c0-8.838 7.164-16 16-16c8.838 0 16 7.162 16 16v32h96v-32c0-8.838 7.164-16 16-16c8.838 0 16 7.162 16 16v32h96v-32c0-8.838 7.164-16 16-16c8.838 0 16 7.162 16 16v32H576v-96H0V448zM576 146.9V112C576 85.49 554.5 64 528 64h-480C21.49 64 0 85.49 0 112v34.94C18.6 153.5 32 171.1 32 192S18.6 230.5 0 237.1V320h576V237.1C557.4 230.5 544 212.9 544 192S557.4 153.5 576 146.9zM192 240C192 248.8 184.8 256 176 256h-32C135.2 256 128 248.8 128 240v-96C128 135.2 135.2 128 144 128h32C184.8 128 192 135.2 192 144V240zM320 240C320 248.8 312.8 256 304 256h-32C263.2 256 256 248.8 256 240v-96C256 135.2 263.2 128 272 128h32C312.8 128 320 135.2 320 144V240zM448 240C448 248.8 440.8 256 432 256h-32C391.2 256 384 248.8 384 240v-96C384 135.2 391.2 128 400 128h32C440.8 128 448 135.2 448 144V240z"/></svg>"""
		else -> null
	}
	
}
