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
import de.msrd0.fontawesome.Style.REGULAR

object FA_CLOSED_CAPTIONING: Icon {
	
	override val name get() = "Closed Captioning"
	
	override val unicode get() = "f20a"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M512 32H64C28.65 32 0 60.65 0 96v320c0 35.35 28.65 64 64 64h448c35.35 0 64-28.65 64-64V96C576 60.65 547.3 32 512 32zM168.6 289.9c18.69 18.72 49.19 18.72 67.87 0c9.375-9.375 24.56-9.375 33.94 0s9.375 24.56 0 33.94c-18.72 18.72-43.28 28.08-67.87 28.08s-49.16-9.359-67.87-28.08C116.5 305.8 106.5 281.6 106.5 256s9.1-49.75 28.12-67.88c37.44-37.44 98.31-37.44 135.7 0c9.375 9.375 9.375 24.56 0 33.94s-24.56 9.375-33.94 0c-18.69-18.72-49.19-18.72-67.87 0C159.5 231.1 154.5 243.2 154.5 256S159.5 280.9 168.6 289.9zM360.6 289.9c18.69 18.72 49.19 18.72 67.87 0c9.375-9.375 24.56-9.375 33.94 0s9.375 24.56 0 33.94c-18.72 18.72-43.28 28.08-67.87 28.08s-49.16-9.359-67.87-28.08C308.5 305.8 298.5 281.6 298.5 256s9.1-49.75 28.12-67.88c37.44-37.44 98.31-37.44 135.7 0c9.375 9.375 9.375 24.56 0 33.94s-24.56 9.375-33.94 0c-18.69-18.72-49.19-18.72-67.87 0C351.5 231.1 346.5 243.2 346.5 256S351.5 280.9 360.6 289.9z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M512 32H64C28.65 32 0 60.65 0 96v320c0 35.35 28.65 64 64 64h448c35.35 0 64-28.65 64-64V96C576 60.65 547.3 32 512 32zM528 416c0 8.822-7.178 16-16 16H64c-8.822 0-16-7.178-16-16V96c0-8.822 7.178-16 16-16h448c8.822 0 16 7.178 16 16V416zM236.5 222.1c9.375 9.375 24.56 9.375 33.94 0c9.375-9.375 9.375-24.56 0-33.94c-37.44-37.44-98.31-37.44-135.7 0C116.5 206.2 106.5 230.4 106.5 256s9.1 49.75 28.12 67.88c18.72 18.72 43.28 28.08 67.87 28.08s49.16-9.359 67.87-28.08c9.375-9.375 9.375-24.56 0-33.94c-9.375-9.375-24.56-9.375-33.94 0c-18.69 18.72-49.19 18.72-67.87 0C159.5 280.9 154.5 268.8 154.5 256s5-24.88 14.06-33.94C187.3 203.3 217.8 203.3 236.5 222.1zM428.5 222.1c9.375 9.375 24.56 9.375 33.94 0c9.375-9.375 9.375-24.56 0-33.94c-37.44-37.44-98.31-37.44-135.7 0C308.5 206.2 298.5 230.4 298.5 256s9.1 49.75 28.12 67.88c18.72 18.72 43.28 28.08 67.87 28.08s49.16-9.359 67.87-28.08c9.375-9.375 9.375-24.56 0-33.94c-9.375-9.375-24.56-9.375-33.94 0c-18.69 18.72-49.19 18.72-67.87 0C351.5 280.9 346.5 268.8 346.5 256s5-24.88 14.06-33.94C379.3 203.3 409.8 203.3 428.5 222.1z"/></svg>"""
		else -> null
	}
	
}
