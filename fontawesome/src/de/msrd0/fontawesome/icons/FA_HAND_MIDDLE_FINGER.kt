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

/** Hand with Middle Finger Raised */
object FA_HAND_MIDDLE_FINGER: Icon {
	
	override val name get() = "Hand with Middle Finger Raised"
	
	override val unicode get() = "f806"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 288v96c0 70.69-57.31 128-128 128H184c-50.35 0-97.76-23.7-127.1-63.98l-14.43-19.23C35.37 420.5 32 410.4 32 400v-48.02c0-14.58 6.629-28.37 18.02-37.48L80 290.5V336C80 344.8 87.16 352 96 352s16-7.164 16-16v-96C112 213.5 133.5 192 160 192s48 21.48 48 48V40C208 17.91 225.9 0 248 0S288 17.91 288 40v189.5C296.6 216.6 311.3 208 328 208c23.48 0 42.94 16.87 47.11 39.14C382.4 242.7 390.8 240 400 240C426.5 240 448 261.5 448 288z"/></svg>"""
		else -> null
	}
	
}
