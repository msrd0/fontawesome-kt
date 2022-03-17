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

/** Head Side Cough */
object FA_HEAD_SIDE_COUGH: Icon {
	
	override val name get() = "Head Side Cough"
	
	override val unicode get() = "e061"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M608 359.1c-13.25 0-24 10.75-24 24s10.75 24 24 24s24-10.75 24-24S621.3 359.1 608 359.1zM477.2 275c-21-47.13-48.49-151.8-73.11-186.8C365.6 33.63 302.5 0 234.1 0L192 0C86 0 0 86 0 192c0 56.75 24.75 107.6 64 142.9L64 512h223.1v-32h64.01c35.38 0 64-28.62 64-63.1L320 416c-17.67 0-32-14.33-32-32s14.33-32 32-32h95.98l-.003-32h31.99C471.1 320 486.6 296.1 477.2 275zM336 224c-17.62 0-32-14.38-32-32s14.38-32 32-32s32 14.38 32 32S353.6 224 336 224zM480 359.1c-13.25 0-23.1 10.75-23.1 24s10.75 24 23.1 24s24-10.75 24-24S493.3 359.1 480 359.1zM608 311.1c13.25 0 24-10.75 24-24s-10.75-24-24-24s-24 10.75-24 24S594.8 311.1 608 311.1zM544 311.1c-13.25 0-23.1 10.75-23.1 24s10.75 24 23.1 24s24-10.75 24-24S557.3 311.1 544 311.1zM544 407.1c-13.25 0-23.1 10.75-23.1 24s10.75 24 23.1 24s24-10.75 24-24S557.3 407.1 544 407.1zM608 455.1c-13.25 0-24 10.75-24 24s10.75 24 24 24s24-10.75 24-24S621.3 455.1 608 455.1z"/></svg>"""
		else -> null
	}
	
}
