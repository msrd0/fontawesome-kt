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

/** Bowling Ball */
object FA_BOWLING_BALL: Icon {
	
	override val name get() = "Bowling Ball"
	
	override val unicode get() = "f436"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM144 208c-17.7 0-32-14.25-32-32s14.3-32 32-32s32 14.25 32 32S161.7 208 144 208zM240 80c17.66 0 31.95 14.25 31.95 32s-14.29 32-31.95 32s-32.05-14.25-32.05-32S222.4 80 240 80zM240 240c-17.7 0-32-14.25-32-32s14.3-32 32-32s32 14.25 32 32S257.7 240 240 240z"/></svg>"""
		else -> null
	}
	
}
