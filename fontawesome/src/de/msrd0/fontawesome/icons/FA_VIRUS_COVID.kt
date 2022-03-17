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

/** Virus Covid */
object FA_VIRUS_COVID: Icon {
	
	override val name get() = "Virus Covid"
	
	override val unicode get() = "e4a8"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M192 24C192 10.75 202.7 0 216 0H296C309.3 0 320 10.75 320 24C320 37.25 309.3 48 296 48H280V81.62C310.7 85.8 338.8 97.88 362.3 115.7L386.1 91.95L374.8 80.64C365.4 71.26 365.4 56.07 374.8 46.7C384.2 37.32 399.4 37.32 408.7 46.7L465.3 103.3C474.7 112.6 474.7 127.8 465.3 137.2C455.9 146.6 440.7 146.6 431.4 137.2L420 125.9L396.3 149.7C414.1 173.2 426.2 201.3 430.4 232H464V216C464 202.7 474.7 192 488 192C501.3 192 512 202.7 512 216V296C512 309.3 501.3 320 488 320C474.7 320 464 309.3 464 296V280H430.4C426.2 310.7 414.1 338.8 396.3 362.3L420 386.1L431.4 374.8C440.7 365.4 455.9 365.4 465.3 374.8C474.7 384.2 474.7 399.4 465.3 408.7L408.7 465.3C399.4 474.7 384.2 474.7 374.8 465.3C365.4 455.9 365.4 440.7 374.8 431.4L386.1 420L362.3 396.3C338.8 414.1 310.7 426.2 280 430.4V464H296C309.3 464 320 474.7 320 488C320 501.3 309.3 512 296 512H216C202.7 512 192 501.3 192 488C192 474.7 202.7 464 216 464H232V430.4C201.3 426.2 173.2 414.1 149.7 396.3L125.9 420.1L137.2 431.4C146.6 440.7 146.6 455.9 137.2 465.3C127.8 474.7 112.6 474.7 103.3 465.3L46.7 408.7C37.32 399.4 37.32 384.2 46.7 374.8C56.07 365.4 71.27 365.4 80.64 374.8L91.95 386.1L115.7 362.3C97.88 338.8 85.8 310.7 81.62 280H48V296C48 309.3 37.25 320 24 320C10.75 320 0 309.3 0 296V216C0 202.7 10.75 192 24 192C37.25 192 48 202.7 48 216V232H81.62C85.8 201.3 97.88 173.2 115.7 149.7L91.95 125.9L80.64 137.2C71.26 146.6 56.07 146.6 46.7 137.2C37.32 127.8 37.32 112.6 46.7 103.3L103.3 46.7C112.6 37.33 127.8 37.33 137.2 46.7C146.6 56.07 146.6 71.27 137.2 80.64L125.9 91.95L149.7 115.7C173.2 97.88 201.3 85.8 232 81.62V48H216C202.7 48 192 37.26 192 24V24zM192 176C165.5 176 144 197.5 144 224C144 250.5 165.5 272 192 272C218.5 272 240 250.5 240 224C240 197.5 218.5 176 192 176zM304 328C317.3 328 328 317.3 328 304C328 290.7 317.3 280 304 280C290.7 280 280 290.7 280 304C280 317.3 290.7 328 304 328z"/></svg>"""
		else -> null
	}
	
}
