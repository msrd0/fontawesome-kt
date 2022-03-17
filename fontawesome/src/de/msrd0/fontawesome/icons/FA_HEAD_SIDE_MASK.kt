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

object FA_HEAD_SIDE_MASK: Icon {
	
	override val name get() = "Head Side Mask"
	
	override val unicode get() = "e063"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M.1465 184.4C-2.166 244.2 23.01 298 63.99 334.9L63.99 512h160L224 316.5L3.674 156.2C1.871 165.4 .5195 174.8 .1465 184.4zM336 368H496L512 320h-255.1l.0178 192h145.9c27.55 0 52-17.63 60.71-43.76L464 464h-127.1c-8.836 0-16-7.164-16-16c0-8.838 7.164-16 16-16h138.7l10.67-32h-149.3c-8.836 0-16-7.164-16-16C320 375.2 327.2 368 336 368zM509.2 275c-20.1-47.13-48.49-151.8-73.11-186.8C397.6 33.63 334.5 0 266.1 0H200C117.1 0 42.48 50.57 13.25 123.7L239.2 288h272.6C511.8 283.7 511.1 279.3 509.2 275zM352 224c-17.62 0-32-14.38-32-32s14.38-32 32-32c17.62 0 31.1 14.38 31.1 32S369.6 224 352 224z"/></svg>"""
		else -> null
	}
	
}
