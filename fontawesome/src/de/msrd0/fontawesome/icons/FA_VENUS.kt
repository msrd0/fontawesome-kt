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

/** Venus */
object FA_VENUS: Icon {
	
	override val name get() = "Venus"
	
	override val unicode get() = "f221"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M368 176c0-97.2-78.8-176-176-176c-97.2 0-176 78.8-176 176c0 86.26 62.1 157.9 144 172.1v35.05H112c-8.836 0-16 7.162-16 16v32c0 8.836 7.164 16 16 16H160v48c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16v-48h48c8.838 0 16-7.164 16-16v-32c0-8.838-7.162-16-16-16H224v-35.05C305.9 333.9 368 262.3 368 176zM192 272c-52.93 0-96-43.07-96-96c0-52.94 43.07-96 96-96c52.94 0 96 43.06 96 96C288 228.9 244.9 272 192 272z"/></svg>"""
		else -> null
	}
	
}
