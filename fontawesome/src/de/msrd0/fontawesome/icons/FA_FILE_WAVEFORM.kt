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

object FA_FILE_WAVEFORM: Icon {
	
	override val name get() = "File waveform"
	
	override val unicode get() = "f478"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M320 0v128h128L320 0zM288 128L288 0H112C85.49 0 64 21.49 64 48V224H16C7.164 224 0 231.2 0 240v32C0 280.8 7.164 288 16 288h128c6.062 0 11.59 3.438 14.31 8.844L176 332.2l49.69-99.38c5.438-10.81 23.19-10.81 28.62 0L281.9 288H352c8.844 0 16 7.156 16 16S360.8 320 352 320h-80c-6.062 0-11.59-3.438-14.31-8.844L240 275.8l-49.69 99.38C187.6 380.6 182.1 384 176 384s-11.59-3.438-14.31-8.844L134.1 320H64v144C64 490.5 85.49 512 112 512h288c26.51 0 48-21.49 48-48V160h-127.1C302.3 160 288 145.7 288 128z"/></svg>"""
		else -> null
	}
	
}

val FA_FILE_MEDICAL_ALT = FA_FILE_WAVEFORM
