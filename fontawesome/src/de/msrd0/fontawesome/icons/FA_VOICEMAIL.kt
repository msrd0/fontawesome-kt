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

/** Voicemail */
object FA_VOICEMAIL: Icon {
	
	override val name get() = "Voicemail"
	
	override val unicode get() = "f897"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M495.1 96c-53.13 0-102 29.25-127 76.13c-25 46.88-22.25 103.8 7.25 147.9H263.7c36.63-54.88 31.25-127.8-13-176.8c-44.38-48.87-116.4-61.37-174.6-30.25s-87.88 97.88-71.75 162c16 64 73.63 108.1 139.6 108.1h352C575.5 384 640 319.5 640 240S575.5 96 495.1 96zM63.99 240c0-44.12 35.88-80 80-80s80 35.88 80 80s-35.88 79.1-80 79.1S63.99 284.1 63.99 240zM495.1 320c-44.13 0-80-35.88-80-79.1s35.88-80 80-80s80 35.88 80 80S540.1 320 495.1 320z"/></svg>"""
		else -> null
	}
	
}
